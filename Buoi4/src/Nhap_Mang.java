import java.util.Scanner;

public class Nhap_Mang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập số phần tử của mảng
        System.out.print("Nhập số phần tử của mảng (n): ");
        int n = scanner.nextInt();

        // Bước 2: Khởi tạo mảng
        int[] arr = new int[n];

        // Bước 3: Nhập các phần tử của mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Bước 4: In các phần tử của mảng
        System.out.println("Các phần tử vừa nhập là:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}