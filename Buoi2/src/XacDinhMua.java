import java.util.Scanner;

public class XacDinhMua {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập số tháng
        System.out.print("Nhập số tháng (1-12): ");
        int thang = scanner.nextInt();

        // Sử dụng cấu trúc switch-case để xác định mùa
        switch (thang) {
            case 3:
            case 4:
            case 5:
                System.out.println("Mùa xuân");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Mùa hạ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Mùa thu");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Mùa đông");
                break;
            default:
                System.out.println("Số tháng không hợp lệ. Vui lòng nhập số từ 1 đến 12.");
                break;
        }

        // Đóng đối tượng Scanner
        scanner.close();
    }
}