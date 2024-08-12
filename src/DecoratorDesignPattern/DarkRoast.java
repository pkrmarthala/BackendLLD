package DecoratorDesignPattern;

public class DarkRoast implements Beverage{

    @Override
    public void getDesc() {
        System.out.println("DarkRoast Cost : " + getCost());
    }

    @Override
    public int getCost() {
        return 150;
    }
}
