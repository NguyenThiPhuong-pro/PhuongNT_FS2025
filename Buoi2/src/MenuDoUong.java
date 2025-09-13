import java.util.Scanner;

public class MenuDoUong {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // In menu cho người dùng
        System.out.println("--- MENU ĐỒ UỐNG ---");
        System.out.println("1. Cà phê");
        System.out.println("2. Trà sữa");
        System.out.println("3. Nước lọc");
        System.out.println("--------------------");

        // Yêu cầu người dùng nhập lựa chọn
        System.out.print("Vui lòng chọn đồ uống theo số: ");
        int luaChon = scanner.nextInt();

        // Sử dụng cấu trúc switch-case để xử lý lựa chọn của người dùng
        switch (luaChon) {
            case 1:
                System.out.println("Bạn đã chọn: Cà phê");
                break;
            case 2:
                System.out.println("Bạn đã chọn: Trà sữa");
                break;
            case 3:
                System.out.println("Bạn đã chọn: Nước lọc");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Không có trong menu.");
                break;
        }

        // Đóng đối tượng Scanner
        scanner.close();
    }
}
