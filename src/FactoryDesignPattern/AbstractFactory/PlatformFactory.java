package FactoryDesignPattern.AbstractFactory;

/*
 This is a simple Factory method, where in we use the if and else conditions to create objects.
 There is no use of run time polymorphism or anything.
 Just an input string comes and based on that we'll be creating the objects.
*/

public class PlatformFactory {
    public static Platform generatePlatformObject(String platformName) {

        if(platformName.equals("Android")) { return new Android(); }

        else if(platformName.equals("iOS")) { return new iOS(); }

        return null;

    }
}
