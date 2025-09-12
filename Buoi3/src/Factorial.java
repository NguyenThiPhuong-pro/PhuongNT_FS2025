// nhập vào số nguyên n. Dùng for để tính n! (giai thừa của n)
import java.util.Scanner;

public class Factorial {
 public static void main(String[] args) {
 // Tạo đối tượng Scanner để nhận dữ liệu từ người dùng
 Scanner scanner = new Scanner(System.in);

 // Yêu cầu người dùng nhập số
 System.out.print("Nhập vào một số nguyên không âm: ");
 int n = scanner.nextInt();

 // Kiểm tra nếu n là số âm
 if (n < 0) {
 System.out.println("Giai thừa của số âm không tồn tại.");
 } else {
 // Khởi tạo biến để lưu trữ kết quả giai thừa
 long factorial = 1;

 // Sử dụng vòng lặp for để tính giai thừa
 for (int i = 1; i <= n; i++) {
 factorial *= i;
 }

 // In ra kết quả
 System.out.println("Giai thừa của " + n + " là: " + factorial);
 }

 // Đóng đối tượng Scanner
 scanner.close();
 }
}