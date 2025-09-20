public class Dem_so_chan_le {
    public static void main(String[] args) {
        // Khai báo và khởi tạo mảng số nguyên
        int[] numbers = {2, 5, 7, 8, 10, 13};

        // Khai báo các biến đếm và khởi tạo bằng 0
        int evenCount = 0;
        int oddCount = 0;

        // Dùng vòng lặp for-each để duyệt qua từng phần tử của mảng
        for (int number : numbers) {
            // Kiểm tra nếu số chia cho 2 có dư bằng 0
            if (number % 2 == 0) {
                // Tăng biến đếm số chẵn
                evenCount++;
            } else {
                // Tăng biến đếm số lẻ
                oddCount++;
            }
        }

        // In ra kết quả
        System.out.println("Tổng số chẵn trong mảng là: " + evenCount);
        System.out.println("Tổng số lẻ trong mảng là: " + oddCount);
    }
}