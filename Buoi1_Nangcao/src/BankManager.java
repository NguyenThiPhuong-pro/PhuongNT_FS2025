// Lớp BankManager quản lý các tài khoản ngân hàng
public class BankManager {

    // Biến instance: số tài khoản và số dư (thuộc về mỗi đối tượng)
    private String accountNumber;
    private double balance;

    // Biến static: lãi suất (thuộc về lớp, dùng chung cho mọi tài khoản)
    private static double interestRate = 0.05; // 5% lãi suất hàng năm

    // Constructor để khởi tạo đối tượng BankAccount
    public BankManager(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Phương thức tính tiền lãi
    public double calculateInterest() {
        // Biến local trong phương thức để lưu tiền lãi
        double interest = this.balance * interestRate;
        return interest;
    }

    // Phương thức in ra thông tin tài khoản và tiền lãi
    public void printAccountInfo() {
        System.out.println("------------------------------------");
        System.out.println("So tai khoan: " + this.accountNumber);
        System.out.println("So du hien tai: " + this.balance + " VND");
        System.out.println("Tien lai: " + this.calculateInterest() + " VND");
        System.out.println("------------------------------------");
    }

    // Phương thức main để chạy chương trình
    public static void main(String[] args) {

        // Tao tai khoan thu nhat
        BankManager account1 = new BankManager("123456789", 5000000.0);

        // Tao tai khoan thu hai
        BankManager account2 = new BankManager("987654321", 10000000.0);

        // In thong tin cua tung tai khoan
        System.out.println("Thong tin tai khoan 1:");
        account1.printAccountInfo();

        System.out.println("\nThong tin tai khoan 2:");
        account2.printAccountInfo();
    }
}