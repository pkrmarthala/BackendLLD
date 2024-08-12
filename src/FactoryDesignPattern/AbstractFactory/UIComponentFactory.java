package FactoryDesignPattern.AbstractFactory;

import FactoryDesignPattern.Components.Button.Button;
import FactoryDesignPattern.Components.Dropdown.Dropdown;
import FactoryDesignPattern.Components.Menu.Menu;

public interface UIComponentFactory {
    Button createButton();
    Dropdown createDropdown();
    Menu createMenu();
}