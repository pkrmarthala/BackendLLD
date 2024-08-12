package FactoryDesignPattern.AbstractFactory;

import FactoryDesignPattern.Components.Button.Button;
import FactoryDesignPattern.Components.Button.iOSButton;
import FactoryDesignPattern.Components.Dropdown.Dropdown;
import FactoryDesignPattern.Components.Dropdown.iOSDropdown;
import FactoryDesignPattern.Components.Menu.Menu;
import FactoryDesignPattern.Components.Menu.iOSMenu;

public class iOSComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new iOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new iOSDropdown();
    }

    @Override
    public Menu createMenu() {
        return new iOSMenu();
    }
}
