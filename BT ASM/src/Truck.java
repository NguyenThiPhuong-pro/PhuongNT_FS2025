// File: Truck.java
public class Truck extends Vehicle {
    private double loadCapacity; // Tải trọng

    // Constructor
    public Truck(String brand, String model, int year, double price, String color, double loadCapacity) {
        // Gọi constructor của lớp cha
        super(brand, model, year, price, color, "Truck");
        this.loadCapacity = loadCapacity;
    }

    // Getter/Setter
    public double getLoadCapacity() { return this.loadCapacity; }
    public void setLoadCapacity(double loadCapacity) { this.loadCapacity = loadCapacity; }

    // Overriding: Phương thức giảm giá 20%
    @Override
    public double applyDiscount() {
        // Giảm 20% (còn lại 80% giá gốc)
        return this.getPrice() * 0.80;
    }

    // toString() Override
    @Override
    public String toString() {
        // Gọi toString của lớp cha, sau đó thêm thông tin riêng
        return super.toString() + String.format("| Tải trọng: %-8.2f | Giá sau KM: %-12.2f |",
                this.loadCapacity, this.applyDiscount());
    }
}