public class Tinh_Tong {
    public static void main(String[] args) {
        // Khai báo và khởi tạo mảng số nguyên
        int[] numbers = {1, 2, 3, 4, 5};

        // Khai báo biến 'sum' và khởi tạo bằng 0 để lưu tổng
        int sum = 0;

        // Dùng vòng lặp for-each để duyệt qua từng phần tử của mảng
        for (int number : numbers) {
            sum += number; // Cộng giá trị của phần tử hiện tại vào biến 'sum'
        }

        // In ra kết quả
        System.out.println("Tổng các phần tử trong mảng là: " + sum);
    }
}