// Câu 4: Nhập vào điểm số (0->100). Nếu >=85 thì in ra "Giỏi", nếu >=65 in ra "Khá"...
import java.util.Scanner;
public class Check_Students {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập điểm
        System.out.print("Nhập điểm số (0-100): ");

        // Đọc điểm số từ người dùng và gán vào biến 'diem'
        int diem = scanner.nextInt();

        // Sử dụng cấu trúc if-else if-else để kiểm tra và xếp loại
        if (diem >= 85) {
            System.out.println("Giỏi");
        } else if (diem >= 65) {
            System.out.println("Khá");
        } else if (diem >= 50) {
            System.out.println("Trung bình");
        } else {
            System.out.println("Yếu");
        }

        // Đóng đối tượng Scanner
        scanner.close();
    }
}