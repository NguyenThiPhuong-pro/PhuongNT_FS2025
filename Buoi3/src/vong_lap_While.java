// Câu 2: Dùng While để in ra các số chẵn trong khoảng 2->200
public class vong_lap_While {
    public static void main(String[] args) {
        int number = 4; // Khởi tạo biến với số chẵn đầu tiên

        while (number <200) { // Lặp cho đến khi số lớn hơn 200
            System.out.println(number); // In số chẵn hiện tại
            number += 2; // Tăng biến lên 2 để có số chẵn tiếp theo
        }
    }
}