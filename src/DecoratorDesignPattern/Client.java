package DecoratorDesignPattern;

public class Client {
    public static void main(String[] args) {

        // Order: Double Mocha DarkRoast with added Milk

        Beverage b = new DarkRoast();

        // Double Mocha
        b = new Mocha(b);
        b = new Mocha(b);

        // Milk
        b = new Milk(b);

        b.getDesc();
        System.out.println("Total Cost : " + b.getCost());
    }
}