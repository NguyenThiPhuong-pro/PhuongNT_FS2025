
// File: GarageManager.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class GarageManager {
    // Sử dụng mảng để quản lý
    private ArrayList<Vehicle> vehicleList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Nhập vào dữ liệu
    public void seedData() {
        vehicleList.add(new Car("Toyota", "Vios", 2021, 50000.0, "Black", 5));
        vehicleList.add(new Truck("Ford", "Ranger", 2020, 75000.0, "Red", 2.5));
        vehicleList.add(new Car("Honda", "City", 2022, 45000.0, "White", 5));
        System.out.println("✅ Đã thêm 3 xe mẫu vào danh sách.");
    }


    // --- CHỨC NĂNG MENU ---

    // 1. Thêm xe mới
    public void addVehicle() {
        System.out.println("\n--- THÊM XE MỚI ---");
        System.out.print("Nhập Hãng xe (brand): ");
        String brand = scanner.nextLine();
        System.out.print("Nhập Dòng xe (model): ");
        String model = scanner.nextLine();
        System.out.print("Nhập Năm sản xuất (year): ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập Giá xe (price): ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập Màu xe (color): ");
        String color = scanner.nextLine();

        System.out.print("Chọn Loại xe (1. Car / 2. Truck): ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            System.out.print("Nhập Số ghế (seatCount): ");
            int seatCount = Integer.parseInt(scanner.nextLine());
            vehicleList.add(new Car(brand, model, year, price, color, seatCount));
        } else if (choice.equals("2")) {
            System.out.print("Nhập Tải trọng (loadCapacity - tấn): ");
            double loadCapacity = Double.parseDouble(scanner.nextLine());
            vehicleList.add(new Truck(brand, model, year, price, color, loadCapacity));
        } else {
            System.out.println("❌ Lựa chọn không hợp lệ. Thêm xe thất bại.");
            return;
        }

        System.out.println("✅ Thêm xe thành công. ID: " + Vehicle.getVehicleCount());
    }

    // 2. Xóa xe theo ID
    public void removeVehicle() {
        System.out.println("\n--- XÓA XE THEO ID ---");
        System.out.print("Nhập ID xe cần xóa: ");
        int idToRemove = Integer.parseInt(scanner.nextLine());

        // Dùng vòng lặp for (hoặc for-each với iterator) để tìm và xóa
        boolean removed = false;
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getId() == idToRemove) {
                vehicleList.remove(i);
                Vehicle.decreaseVehicleCount(); // Giảm biến đếm static
                removed = true;
                System.out.println("✅ Xe có ID " + idToRemove + " đã được xóa.");
                break;
            }
        }

        if (!removed) {
            System.out.println("❌ Không tìm thấy xe với ID " + idToRemove);
        }
    }

    // 3. Hiển thị danh sách xe
    public void displayVehicles() {
        System.out.println("\n--- DANH SÁCH XE TRONG GARA ---");

        // Kiểm tra số lượng xe (dùng static)
        int count = Vehicle.getVehicleCount();
        System.out.println("💡 TỔNG SỐ XE HIỆN TẠI: " + count);

        if (count > 20) {
            System.out.println("🎉 Gara lớn!");
        } else {
            System.out.println("🏡 Gara nhỏ.");
        }

        if (vehicleList.isEmpty()) {
            System.out.println("Danh sách xe trống.");
            return;
        }

        // Tiêu đề
        System.out.println("===================================================================================================================================");
        System.out.printf("| %-4s | %-10s | %-10s | %-4s | %-12s | %-10s | %-10s | %-10s | %-12s |\n",
                "ID", "Hãng", "Dòng", "Năm", "Giá Gốc", "Màu", "Loại", "Thông tin Riêng", "Giá Sau KM");
        System.out.println("===================================================================================================================================");

        // Dùng vòng lặp for-each
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle); // Gọi toString()
        }
        System.out.println("===================================================================================================================================");
    }

    // 4. Tìm kiếm xe theo hãng
    public void searchByBrand() {
        System.out.println("\n--- TÌM KIẾM XE THEO HÃNG ---");
        System.out.print("Nhập Hãng xe cần tìm: ");
        String searchBrand = scanner.nextLine().trim();

        ArrayList<Vehicle> results = new ArrayList<>();

        // Dùng vòng lặp for
        for (int i = 0; i < vehicleList.size(); i++) {
            Vehicle v = vehicleList.get(i);
            // So sánh không phân biệt hoa thường
            if (v.getBrand().equalsIgnoreCase(searchBrand)) {
                results.add(v);
            }
        }

        if (results.isEmpty()) {
            System.out.println("🔎 Không tìm thấy xe nào của hãng " + searchBrand);
        } else {
            System.out.println("🔎 Kết quả tìm kiếm cho hãng " + searchBrand + " (" + results.size() + " xe):");
            // Tiêu đề (có thể tạo một hàm in tiêu đề chung)
            System.out.println("===================================================================================================================================");
            System.out.printf("| %-4s | %-10s | %-10s | %-4s | %-12s | %-10s | %-10s | %-10s | %-12s |\n",
                    "ID", "Hãng", "Dòng", "Năm", "Giá Gốc", "Màu", "Loại", "Thông tin Riêng", "Giá Sau KM");
            System.out.println("===================================================================================================================================");

            // Dùng for-each để in kết quả
            for (Vehicle v : results) {
                System.out.println(v);
            }
            System.out.println("===================================================================================================================================");
        }
    }

    // 5. Sắp xếp xe theo giá tăng dần
    public void sortByPriceAscending() {
        System.out.println("\n--- SẮP XẾP THEO GIÁ TĂNG DẦN ---");

        Collections.sort(vehicleList, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle v1, Vehicle v2) {
                // So sánh giá (tăng dần: v1.price - v2.price)
                return Double.compare(v1.getPrice(), v2.getPrice());
            }
        });

        System.out.println("✅ Danh sách đã được sắp xếp theo giá tăng dần.");
        displayVehicles();
    }

    // 6. Sắp xếp xe theo năm sản xuất giảm dần
    public void sortByYearDescending() {
        System.out.println("\n--- SẮP XẾP THEO NĂM SẢN XUẤT GIẢM DẦN ---");

        Collections.sort(vehicleList, (v1, v2) -> {
            // So sánh năm (giảm dần: v2.year - v1.year)
            return Integer.compare(v2.getYear(), v1.getYear());
        });

        System.out.println("✅ Danh sách đã được sắp xếp theo năm sản xuất giảm dần.");
        displayVehicles();
    }

    // --- HÀM CHÍNH VÀ MENU ---

    public void showMenu() {
        int choice;
        // Dùng vòng lặp while để duy trì chương trình
        while (true) {
            System.out.println("\n===== QUẢN LÝ GARA XE =====");
            System.out.println("1. Thêm xe mới");
            System.out.println("2. Xóa xe theo ID");
            System.out.println("3. Hiển thị danh sách xe");
            System.out.println("4. Tìm kiếm xe theo hãng");
            System.out.println("5. Sắp xếp xe theo giá tăng dần");
            System.out.println("6. Sắp xếp xe theo năm sản xuất giảm dần");
            System.out.println("0. Thoát");
            System.out.println("===========================");
            System.out.print("🎯 Chọn chức năng: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Lỗi: Vui lòng nhập số từ 0 đến 6.");
                continue;
            }

            // Sử dụng switch-case để xử lý menu
            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    removeVehicle();
                    break;
                case 3:
                    displayVehicles();
                    break;
                case 4:
                    searchByBrand();
                    break;
                case 5:
                    sortByPriceAscending();
                    break;
                case 6:
                    sortByYearDescending();
                    break;
                case 0:
                    System.out.println("👋 Cảm ơn bạn đã sử dụng chương trình. Tạm biệt!");
                    return; // Thoát khỏi hàm showMenu, kết thúc chương trình
                default:
                    System.out.println("❌ Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public static void main(String[] args) {
        GarageManager manager = new GarageManager();
        manager.seedData(); // Thêm data mẫu để tiện test
        manager.showMenu();
    }
}