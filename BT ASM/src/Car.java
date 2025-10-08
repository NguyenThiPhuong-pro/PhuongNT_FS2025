
// File: Car.java
public class Car extends Vehicle {
    private int seatCount; // Thuộc tính riêng

    // Constructor
    public Car(String brand, String model, int year, double price, String color, int seatCount) {
        // Gọi constructor của lớp cha
        super(brand, model, year, price, color, "Car");
        this.seatCount = seatCount;
    }

    // Getter/Setter
    public int getSeatCount() { return this.seatCount; }
    public void setSeatCount(int seatCount) { this.seatCount = seatCount; }

    // Overriding: Phương thức giảm giá 15%
    @Override
    public double applyDiscount() {
        // Giảm 15% (còn lại 85% giá gốc)
        return this.getPrice() * 0.85;
    }

    // toString() Override
    @Override
    public String toString() {
        // Gọi toString của lớp cha, sau đó thêm thông tin riêng
        return super.toString() + String.format("| Ghế: %-5d | Giá sau KM: %-12.2f |",
                this.seatCount, this.applyDiscount());
    }
}