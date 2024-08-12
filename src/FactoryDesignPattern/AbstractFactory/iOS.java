package FactoryDesignPattern.AbstractFactory;

public class iOS extends Platform {

    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new iOSComponentFactory();
    }
}
