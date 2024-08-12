package FactoryDesignPattern.AbstractFactory;

import FactoryDesignPattern.Components.Button.Button;
import FactoryDesignPattern.Components.Dropdown.Dropdown;
import FactoryDesignPattern.Components.Menu.Menu;

public class Client {
    /*
     * Execution starts from the client class. Here we are just given a platform name as a string, and
     * we need to have the Button, Dropdown and the Menu generated based on this String input given.
     *
     * The Client class passes the platformName to the Platform class to create the corresponding Platform object.
     * Android in this case.
     *
     * The createPlatform() method of the Platform Class receives this platformName as pfName and
     * passes it to the PlatformFactory to generate the corresponding Platform object.
     *
     *
     */

    public static void main(String[] args) {
        // Platform p = new Android();

        String platformName = "Android";
        Platform p = Platform.createPlatformObject(platformName);

        UIComponentFactory uicf = p.createUIComponentFactory();

        Button b = uicf.createButton();
        Dropdown d = uicf.createDropdown();
        Menu m = uicf.createMenu();

    }

}
