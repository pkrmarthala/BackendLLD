package DecoratorDesignPattern;

public class Milk implements AddOn { // Wrapper or the Decorator Class

    Beverage b;

    // Constructor
    public Milk(Beverage b) {
        this.b = b;
    }

    @Override
    public void getDesc() {
        b.getDesc();
        System.out.println("Milk cost: " + getCost());
    }

    @Override
    public int getCost() {
        return b.getCost() + 10;
    }
}
