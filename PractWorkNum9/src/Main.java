public class Main {
    public static void main(String[] args) {
        Nameable planet = new Planet("Earth");
        Nameable car = new Car("Toyota");
        Nameable animal = new Animal("Lion");

        System.out.println("Name of planet: " + planet.getName());
        System.out.println("Name of car: " + car.getName());
        System.out.println("Name of animal: " + animal.getName());

        Priceable product = new Product("Laptop", 1000.0);
        Priceable vehicle = new Vehicle("Sedan", 25000.0);

        System.out.println("Price of product: $" + product.getPrice());
        System.out.println("Price of vehicle: $" + vehicle.getPrice());
    }
}
