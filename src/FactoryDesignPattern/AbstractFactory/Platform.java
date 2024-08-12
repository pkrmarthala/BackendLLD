package FactoryDesignPattern.AbstractFactory;

public abstract class Platform {
    // Native methods of Platform Class
    public void setRefreshRate(){
        System.out.println("Refresh Rate set to 120Hz.");
    }

    public void setTheme(){
        System.out.println("Theme set to Dark.");
    }

    public static Platform createPlatformObject(String pfName){
        return PlatformFactory.generatePlatformObject(pfName);
    }

    /*
     * In a layman way if we need to create a button, we can do as below.

    public Button createButton(){
        if(the object passed is an instance of Android) {
            return new AndroidButton();
        } else if(the object is an instance of iOS) {
            return new iOSButton();
        }
    }

     */

    /* Instead of doing this, we will create an abstract Factory method. If the purpose is just to create a Button.
     * But there are multiple objects. Hence, we'll create an interface, UI Components.
     */
    // public abstract Button createButton();

    /* An abstract method to create UIComponentFactory
     * An abstract method is a method that is declared without an implementation.
     * This means it only has a method signature (name, return type, and parameters) but no body.
     * Abstract methods are typically used in abstract classes or interfaces
     * to define a method that must be implemented by subclasses or classes that implement the interface.
     */
    public abstract UIComponentFactory createUIComponentFactory();

}
