// Lớp ProductManager để quản lý sản phẩm
public class ProductManager {

    // Biến instance: tên sản phẩm, giá tiền
    private String productName;
    private double price;

    // Biến static: biến đếm số lượng sản phẩm đã tạo
    private static int count = 0;

    // Constructor để khởi tạo đối tượng san_pham
    public ProductManager(String productName, double price) {
        this.productName = productName;
        this.price = price;
        // Tăng biến count mỗi khi một sản phẩm mới được tạo
        count++;
    }

    // Phương thức in ra thông tin sản phẩm
    public void printProductInfo() {
        System.out.println("------------------------------------");
        System.out.println("Ten san pham: " + this.productName);
        System.out.println("Gia tien: " + this.price + " VND");
        System.out.println("------------------------------------");
    }

    // Phương thức in ra tổng số sản phẩm đã tạo
    public static void printTotalProducts() {
        System.out.println("\nTong so san pham da tao: " + count);
    }

    // Phương thức main để chạy chương trình
    public static void main(String[] args) {

        // Tạo 3 sản phẩm
        ProductManager product1 = new ProductManager("Laptop", 15000000.0);
        ProductManager product2 = new ProductManager("Dien thoai", 8000000.0);
        ProductManager product3 = new ProductManager("Tai nghe", 1500000.0);

        // In thong tin cua tung san pham
        product1.printProductInfo();
        product2.printProductInfo();
        product3.printProductInfo();

        // In tong so san pham da tao
        printTotalProducts();
    }
}
