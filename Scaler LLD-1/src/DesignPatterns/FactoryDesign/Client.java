package DesignPatterns.FactoryDesign;

import DesignPatterns.FactoryDesign.Components.Button.Button;
import DesignPatterns.FactoryDesign.Components.DropDown.DropDown;
import DesignPatterns.FactoryDesign.Components.Menu.Menu;

public class Client {
    public static void main(String[] args) {

        Flutter flutter=new Flutter("ios");

        UIFactory factory=flutter.createUIFactory();

        Button button=factory.createButton();
        DropDown dropDown =factory.createDropDown();
        Menu menu =factory.createMenu();

        button.sayHi();
        dropDown.hiDropDown();
        menu.hiMenu();
    }
}
