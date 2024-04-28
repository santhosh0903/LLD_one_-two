package DesignPatterns.FactoryDesign;

import DesignPatterns.FactoryDesign.Components.Button.Button;
import DesignPatterns.FactoryDesign.Components.Button.IosButton;
import DesignPatterns.FactoryDesign.Components.DropDown.DropDown;
import DesignPatterns.FactoryDesign.Components.DropDown.IosDropDown;
import DesignPatterns.FactoryDesign.Components.Menu.IosMenu;
import DesignPatterns.FactoryDesign.Components.Menu.Menu;

public class IosUIFactory implements  UIFactory{
    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }

    @Override
    public IosDropDown createDropDown() {
        return new IosDropDown();
    }
}
