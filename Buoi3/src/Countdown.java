// Dùng While in ra dãy số đếm ngược 10 -> 1. Sau khi kết thúc, in ra chữ "Hết giờ"
public class Countdown {
    public static void main(String[] args) {
        int i = 10; // Khởi tạo biến đếm ngược

        while (i >= 1) { // Vòng lặp tiếp tục khi i lớn hơn hoặc bằng 1
            System.out.println(i); // In ra giá trị hiện tại của i
            i--; // Giảm giá trị của i đi 1 sau mỗi lần lặp
        }

        System.out.println("Hết giờ"); // In ra thông báo khi vòng lặp kết thúc
    }
}