public class Max_Numbers {
    public static void main(String[] args) {
        // Khai báo và khởi tạo mảng
        int[] numbers = {3, 7, 2, 9, 5};

        // Khởi tạo biến max với giá trị của phần tử đầu tiên trong mảng
        int max = numbers[0];

        // Sử dụng vòng lặp for-each để duyệt qua từng phần tử
        for (int number : numbers) {
            // So sánh phần tử hiện tại với giá trị lớn nhất đã tìm thấy
            if (number > max) {
                max = number; // Cập nhật lại giá trị lớn nhất
            }
        }

        // In ra số lớn nhất
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }
}