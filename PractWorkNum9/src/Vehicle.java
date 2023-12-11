public class Vehicle implements Priceable {
    private String model;
    private double price;

    public Vehicle(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
