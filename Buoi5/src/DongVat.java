public class DongVat {
    // Phương thức keu() của lớp cha
    public void keu() {
        System.out.println("Dong vat keu.");
    }

    // --- Class Cho kế thừa DongVat và ghi đè phương thức keu() ---
    public static class Cho extends DongVat {
        @Override
        public void keu() {
            System.out.println("Gau gau.");
        }
    }

    // --- Class Meo kế thừa DongVat và ghi đè phương thức keu() ---
    public static class Meo extends DongVat {
        @Override
        public void keu() {
            System.out.println("Meo meo.");
        }
    }

    // --- Phương thức main để chạy chương trình ---
    public static void main(String[] args) {
        // Tạo một mảng DongVat
        DongVat[] danhSachDongVat = new DongVat[2];

        // Thêm một đối tượng Cho vào mảng
        danhSachDongVat[0] = new Cho();

        // Thêm một đối tượng Meo vào mảng
        danhSachDongVat[1] = new Meo();

        // Duyệt mảng và gọi phương thức keu() cho từng đối tượng
        System.out.println("Tieng keu cua cac loai dong vat:");
        for (DongVat dv : danhSachDongVat) {
            dv.keu();
        }
    }
}