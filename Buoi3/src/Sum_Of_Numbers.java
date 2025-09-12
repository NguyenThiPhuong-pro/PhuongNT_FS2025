// Câu 3: Viết chương trình dùng for tính tổng các số 1->100 và in ra  kết quả.
public class Sum_Of_Numbers {
    public static void main(String[] args) {
        int sum = 0; // Khai báo và khởi tạo biến sum

        for (int i = 1; i <= 100; i++) {
            sum += i; // Cộng dồn giá trị của i vào biến sum
        }

        System.out.println("Tổng các số từ 1 đến 100 là: " + sum);
    }
}