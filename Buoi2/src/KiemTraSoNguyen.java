// Nhập vào 1 số nguyên. In ra "số dương" nếu >0, in ra "số âm" nếu <0 và in ra "bằng 0" nếu =0
import java.util.Scanner;

public class KiemTraSoNguyen {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập một số nguyên
        System.out.print("Nhập một số nguyên: ");

        // Đọc số nguyên từ người dùng
        int soNguyen = scanner.nextInt();

        // Sử dụng cấu trúc if-else if-else để kiểm tra giá trị của số
        if (soNguyen > 0) {
            System.out.println("Số dương");
        } else if (soNguyen < 0) {
            System.out.println("Số âm");
        } else {
            System.out.println("Bằng 0");
        }

        // Đóng đối tượng Scanner
        scanner.close();
    }
}