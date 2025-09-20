import java.util.Scanner;
public class Tim_so_lon_nhat{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập số phần tử của mảng
        System.out.print("Nhập số phần tử của mảng (n): ");
        int n = scanner.nextInt();

        // Khởi tạo mảng
        int[] arr = new int[n];

        // Nhập các phần tử của mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Bước 2: Tìm số lớn nhất trong mảng
        // Giả sử phần tử đầu tiên là số lớn nhất
        int max = arr[0];

        // Duyệt qua mảng từ phần tử thứ hai
        for (int i = 1; i < n; i++) {
            // Nếu phần tử hiện tại lớn hơn 'max', cập nhật 'max'
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Bước 3: In ra kết quả
        System.out.println("Số lớn nhất trong mảng là: " + max);

        scanner.close();
    }
}