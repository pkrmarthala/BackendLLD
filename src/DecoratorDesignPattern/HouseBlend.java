package DecoratorDesignPattern;

public class HouseBlend implements Beverage {
    @Override
    public void getDesc() {
        System.out.println("HouseBlend Cost : " + getCost());
    }

    @Override
    public int getCost() {
        return 100;
    }
}
