// Câu 9: Máy tính đơn giản với switch-case. Người dùng nhập 2 số và một ký tự (+, -, *, /)....
import java.util.Scanner;
public class MayTinhDonGian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double so1, so2, ketQua;
        char toanTu;

        // Nhập số thứ nhất
        System.out.print("Nhập số thứ nhất: ");
        so1 = scanner.nextDouble();

        // Nhập toán tử
        System.out.print("Nhập toán tử (+, -, *, /): ");
        toanTu = scanner.next().charAt(0);

        // Nhập số thứ hai
        System.out.print("Nhập số thứ hai: ");
        so2 = scanner.nextDouble();

        // Sử dụng switch-case để thực hiện phép tính
        switch (toanTu) {
            case '+':
                ketQua = so1 + so2;
                System.out.println("Kết quả: " + so1 + " + " + so2 + " = " + ketQua);
                break;
            case '-':
                ketQua = so1 - so2;
                System.out.println("Kết quả: " + so1 + " - " + so2 + " = " + ketQua);
                break;
            case '*':
                ketQua = so1 * so2;
                System.out.println("Kết quả: " + so1 + " * " + so2 + " = " + ketQua);
                break;
            case '/':
                // Xử lý trường hợp chia cho 0
                if (so2 != 0) {
                    ketQua = so1 / so2;
                    System.out.println("Kết quả: " + so1 + " / " + so2 + " = " + ketQua);
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0.");
                }
                break;
            default:
                System.out.println("Toán tử không hợp lệ. Vui lòng nhập +, -, *, hoặc /.");
                break;
        }

        scanner.close();
    }
}