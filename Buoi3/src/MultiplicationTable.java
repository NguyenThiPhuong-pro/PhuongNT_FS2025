// Câu 5: Nhập vào số nguyên n. Dùng for để in bảng cửu chương của n
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập số
        System.out.print("Nhập một số nguyên n để in bảng cửu chương: ");
        int n = scanner.nextInt();

        System.out.println("Bảng cửu chương của " + n + ":");

        // Sử dụng vòng lặp for để in bảng cửu chương
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

        // Đóng đối tượng Scanner
        scanner.close();
    }
}