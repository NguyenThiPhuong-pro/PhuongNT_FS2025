public class HocSinh {
    // Thuộc tính của lớp Học Sinh
    String ten;
    int tuoi;
    String lop;

    // Phương thức để học bài
    public void hocBai() {
        System.out.println(ten + " đang học bài.");
    }

    public static void main(String[] args) {
        // Tạo đối tượng học sinh thứ nhất
        HocSinh hocSinh1 = new HocSinh();
        hocSinh1.ten = "Nguyễn Thị Phương";
        hocSinh1.tuoi = 15;
        hocSinh1.lop = "10A1";

        // Tạo đối tượng học sinh thứ hai
        HocSinh hocSinh2 = new HocSinh();
        hocSinh2.ten = "Trần Thị Quỳnh";
        hocSinh2.tuoi = 16;
        hocSinh2.lop = "11B2";

        // Gọi phương thức hocBai() cho từng học sinh
        hocSinh1.hocBai();
        hocSinh2.hocBai();
    }
}