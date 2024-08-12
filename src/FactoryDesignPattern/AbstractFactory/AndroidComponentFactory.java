package FactoryDesignPattern.AbstractFactory;

import FactoryDesignPattern.Components.Button.AndroidButton;
import FactoryDesignPattern.Components.Button.Button;
import FactoryDesignPattern.Components.Dropdown.AndroidDropdown;
import FactoryDesignPattern.Components.Dropdown.Dropdown;
import FactoryDesignPattern.Components.Menu.AndroidMenu;
import FactoryDesignPattern.Components.Menu.Menu;

public class AndroidComponentFactory implements UIComponentFactory{

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
