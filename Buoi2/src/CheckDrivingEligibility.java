// Nhập vào tuổi của một người. Nếu >=19 thì in "đủ điều kiện lái xe", ngược lại in "chưa đủ điều kiên"

import java.util.Scanner;

public class CheckDrivingEligibility {

    public static void main(String[] args) {
        // Khai báo đối tượng Scanner để nhận dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập tuổi
        System.out.print("Moi ban nhap tuoi: ");

        // Đọc số nguyên từ bàn phím
        int age = scanner.nextInt();

        // Sử dụng câu lệnh if-else để kiểm tra điều kiện
        if (age >= 18) {
            System.out.println("Du dieu kien lai xe.");
        } else {
            System.out.println("Chua du dieu kien lai xe.");
        }

        // Đóng đối tượng Scanner
        scanner.close();
    }
}