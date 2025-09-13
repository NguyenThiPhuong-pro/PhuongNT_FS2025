// Câu 1: Viết chương trình nhập vào một số nguyên. In ra "số chẵn" nếu số đó chia hết cho 2 và ngược lại in "số lẻ"
import java.util.Scanner;

public class CheckEvenOdd {

    public static void main(String[] args) {
        // Khai báo đối tượng Scanner để nhận dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập một số nguyên
        System.out.print("Moi ban nhap mot so nguyen: ");

        // Đọc số nguyên từ bàn phím
        int number = scanner.nextInt();

        // Sử dụng toán tử % (chia lấy dư) để kiểm tra số chẵn/lẻ
        if (number % 2 == 0) {
            System.out.println("So ban vua nhap la so chan.");
        } else {
            System.out.println("So ban vua nhap la so le.");
        }

        // Đóng đối tượng Scanner để giải phóng tài nguyên
        scanner.close();
    }
}