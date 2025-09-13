// Câu 3: Nhập vào điểm số (0->100). Nếu điểm >=50 thì in "Qua môn", ngược lại in ra "Trượt"
import java.util.Scanner;

public class Check_Score {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập điểm
        System.out.print("Nhập điểm số (0-100): ");

        // Đọc điểm số từ người dùng
        int diem = scanner.nextInt();

        // Kiểm tra điều kiện và in ra kết quả
        if (diem >= 50) {
            System.out.println("Qua môn");
        } else {
            System.out.println("Trượt");
        }

        // Đóng đối tượng Scanner để giải phóng tài nguyên
        scanner.close();
    }
}