// Cho mảng: {1, 2, 3, 4, 5, 6}. Dùng for-each để tính tổng các sẵn trong mảng
public class SumEvenNumbers {
    public static void main(String[] args) {
        // Khai báo và khởi tạo mảng
        int[] numbers = {1, 2, 3, 4, 5, 6};

        // Khởi tạo biến tổng
        int sumOfEvens = 0;

        // Sử dụng vòng lặp for-each để duyệt mảng
        for (int number : numbers) {
            // Kiểm tra xem số có phải là số chẵn không
            if (number % 2 == 0) {
                // Nếu là số chẵn, cộng vào tổng
                sumOfEvens += number;
            }
        }

        // In ra kết quả cuối cùng
        System.out.println("Tổng các số chẵn trong mảng là: " + sumOfEvens);
    }
}