// Câu 7: Tính giá xem phem theo độ tuổi: Nếu <12 tuổi -> giá vé 20.000đ...
import java.util.Scanner;
public class TinhGiaVePhim {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập tuổi
        System.out.print("Nhập tuổi của bạn: ");

        // Đọc tuổi từ người dùng và gán vào biến 'tuoi'
        int tuoi = scanner.nextInt();

        // Khai báo biến 'giaVe' và gán giá trị mặc định là 0
        int giaVe = 0;

        // Sử dụng cấu trúc if-else if-else để xác định giá vé
        if (tuoi < 12) {
            giaVe = 20000;
        } else if (tuoi >= 12 && tuoi <= 17) {
            giaVe = 40000;
        } else { // Trường hợp còn lại: tuổi >= 18
            giaVe = 60000;
        }

        // In ra kết quả
        System.out.println("Giá vé xem phim của bạn là: " + giaVe + "đ");

        // Đóng đối tượng Scanner
        scanner.close();
    }
}