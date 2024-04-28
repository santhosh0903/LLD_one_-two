package DesignPatterns.FactoryDesign;

import DesignPatterns.FactoryDesign.Components.Button.Button;
import DesignPatterns.FactoryDesign.Components.DropDown.DropDown;
import DesignPatterns.FactoryDesign.Components.Menu.Menu;

public interface UIFactory {

    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
