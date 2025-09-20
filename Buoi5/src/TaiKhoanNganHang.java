public class TaiKhoanNganHang {

    // Thuộc tính private: chỉ có thể truy cập bên trong class này
    private String soTaiKhoan;
    private double soDu;

    // Constructor để khởi tạo đối tượng TaiKhoanNganHang
    public TaiKhoanNganHang(String soTaiKhoan, double soDuBanDau) {
        this.soTaiKhoan = soTaiKhoan;
        this.soDu = soDuBanDau;
    }

    // Phương thức công khai (public) để nạp tiền vào tài khoản
    public void napTien(double soTien) {
        if (soTien > 0) {
            this.soDu += soTien;
            System.out.println("Bạn đã nạp thành công " + soTien + " vào tài khoản.");
        } else {
            System.out.println("Số tiền nạp phải lớn hơn 0.");
        }
    }

    // Phương thức công khai (public) để rút tiền từ tài khoản
    public void rutTien(double soTien) {
        if (soTien > 0 && this.soDu >= soTien) {
            this.soDu -= soTien;
            System.out.println("Bạn đã rút thành công " + soTien + " từ tài khoản.");
        } else if (soTien <= 0) {
            System.out.println("Số tiền rút phải lớn hơn 0.");
        } else {
            System.out.println("Số dư trong tài khoản không đủ để thực hiện giao dịch này.");
        }
    }

    // Phương thức công khai (public) để xem số dư hiện tại
    public void xemSoDu() {
        System.out.println("Số tài khoản: " + this.soTaiKhoan);
        System.out.println("Số dư hiện tại: " + this.soDu);
    }

    public static void main(String[] args) {
        // Tạo một đối tượng TaiKhoanNganHang với số dư ban đầu là 1000
        TaiKhoanNganHang taiKhoan = new TaiKhoanNganHang("123456789", 1000);

        // Xem số dư ban đầu
        taiKhoan.xemSoDu();

        // Nạp tiền
        System.out.println("--- Thực hiện nạp tiền ---");
        taiKhoan.napTien(500);
        taiKhoan.xemSoDu();

        // Rút tiền
        System.out.println("--- Thực hiện rút tiền ---");
        taiKhoan.rutTien(200);
        taiKhoan.xemSoDu();

        // Thử rút một số tiền lớn hơn số dư hiện có
        System.out.println("--- Thử rút số tiền lớn hơn số dư ---");
        taiKhoan.rutTien(1500);
        taiKhoan.xemSoDu();
    }
}