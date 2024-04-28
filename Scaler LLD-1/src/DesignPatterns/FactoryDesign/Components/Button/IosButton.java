package DesignPatterns.FactoryDesign.Components.Button;

public class IosButton implements Button{
    @Override
    public void sayHi() {
        System.out.println("Hi i am IOS button");
    }
}
