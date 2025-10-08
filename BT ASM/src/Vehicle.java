// File: Vehicle.java
public abstract class Vehicle {
    // 1. Thuộc tính (private)
    private int id;
    private String brand;
    private String model;
    private int year;
    private double price;
    private String color;
    private String type; // Loại xe (Car, Truck, ...)

    // 2. Static biến đếm tổng số xe
    private static int nextId = 1; // Dùng để tự tăng ID
    private static int vehicleCount = 0; // Tổng số xe hiện tại

    // 3. Hằng số (Ví dụ)
    public static final String DEFAULT_COLOR = "White";

    // 4. Constructor Overloading
    // Constructor 1: Dùng cho việc thêm xe mới
    public Vehicle(String brand, String model, int year, double price, String color, String type) {
        this.id = nextId++; // Gán ID và tăng biến đếm
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.type = type;
        vehicleCount++; // Tăng tổng số xe
    }

    // Constructor 2: Constructor mặc định (dùng this())
    public Vehicle() {
        this("Unknown Brand", "Unknown Model", 2023, 0.0, DEFAULT_COLOR, "Generic");
        // Gọi Constructor 1 để thiết lập các giá trị mặc định và tự tăng ID
        // (Chú ý: vehicleCount sẽ bị tăng 2 lần nếu gọi this() trong constructor 1,
        // cần điều chỉnh logic: nên đặt logic ID và count ở constructor chính)
    }

    // Điều chỉnh logic: Constructor mặc định không tăng count, dùng chủ yếu để kế thừa
    /*
    public Vehicle() {
        this.brand = "Unknown";
        // ... (thiết lập các giá trị mặc định)
    }
    */


    // 5. Getter và Setter (Sử dụng this)
    public int getId() { return this.id; }
    public String getBrand() { return this.brand; }
    // Setter
    public void setBrand(String brand) { this.brand = brand; }
    // ... (Thêm các getter/setter còn lại cho model, year, price, color, type)
    public int getYear() { return this.year; }
    public double getPrice() { return this.price; }
    public String getType() { return this.type; }

    // Static Getter
    public static int getVehicleCount() { return vehicleCount; }
    public static void decreaseVehicleCount() { vehicleCount--; } // Dùng khi xóa xe

    // 6. Phương thức trừu tượng (Overriding)
    public abstract double applyDiscount();

    // 7. toString() Override
    @Override
    public String toString() {
        return String.format("| %-4d | %-10s | %-10s | %-4d | %-12.2f | %-10s | %-10s ",
                this.id, this.brand, this.model, this.year, this.price, this.color, this.type);
    }

    // 8. Phương thức hiển thị chi tiết (Có thể dùng khi in)
    public void displayInfo() {
        System.out.println(this.toString());
    }
}