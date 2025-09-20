import java.util.Scanner;

public class Dao_nguoc_mang {
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

        // Bước 2: In mảng theo thứ tự đảo ngược
        System.out.println("Mảng theo thứ tự đảo ngược là:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
