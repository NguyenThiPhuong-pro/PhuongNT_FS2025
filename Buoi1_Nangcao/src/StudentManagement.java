// Lớp Student quản lý thông tin sinh viên
public class StudentManagement {

    // Biến instance: tên, tuổi, điểm trung bình
    private String name;
    private int age;
    private double gpa;

    // Biến static: tên trường (dùng chung cho mọi sinh viên)
    private static String schoolName = "Dai hoc ABC";

    // Constructor để khởi tạo đối tượng Student
    public StudentManagement(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Phương thức in ra thông tin chi tiết và xếp loại
    public void displayInfo() {
        // Biến local để xác định xếp loại
        String rank;
        if (gpa >= 8.0) {
            rank = "Giỏi";
        } else if (gpa >= 6.5) {
            rank = "Khá";
        } else {
            rank = "Trung bình";
        }

        System.out.println("------------------------------------");
        System.out.println("Tên sinh viên: " + this.name);
        System.out.println("Tuổi: " + this.age);
        System.out.println("GPA: " + this.gpa);
        System.out.println("Xếp loại: " + rank);
        System.out.println("Tên trường: " + schoolName);
        System.out.println("------------------------------------");
    }

    // Phương thức main để chạy chương trình
    public static void main(String[] args) {

        // Tạo sinh viên thứ nhất
        StudentManagement student1 = new StudentManagement("Nguyễn Văn A", 20, 8.5);

        // Tạo sinh viên thứ hai
        StudentManagement student2 = new StudentManagement("Lê Thị B", 21, 7.2);

        // In thông tin của từng sinh viên
        System.out.println("Thông tin sinh viên 1:");
        student1.displayInfo();

        System.out.println("\nThông tin sinh viên 2:");
        student2.displayInfo();
    }
}
