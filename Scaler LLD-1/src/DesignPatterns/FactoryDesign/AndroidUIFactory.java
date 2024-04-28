package DesignPatterns.FactoryDesign;

import DesignPatterns.FactoryDesign.Components.Button.AndroidButton;
import DesignPatterns.FactoryDesign.Components.Button.Button;
import DesignPatterns.FactoryDesign.Components.DropDown.AndroidDropDown;
import DesignPatterns.FactoryDesign.Components.DropDown.DropDown;
import DesignPatterns.FactoryDesign.Components.Menu.AndroidMenu;
import DesignPatterns.FactoryDesign.Components.Menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropDown createDropDown() {
        return new AndroidDropDown();
    }
}
