package DecoratorDesignPattern;

public class Mocha implements AddOn { // Wrapper or the Decorator Class
    Beverage b;

    public Mocha(Beverage b) {
        this.b = b;
    }

    @Override
    public void getDesc() {
        b.getDesc();
        System.out.println("Mocha Cost : " + getCost());
    }

    @Override
    public int getCost() {
        return b.getCost() + 1;
    }
}
