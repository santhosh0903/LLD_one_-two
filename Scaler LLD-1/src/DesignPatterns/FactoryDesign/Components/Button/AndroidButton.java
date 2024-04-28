package DesignPatterns.FactoryDesign.Components.Button;

public class AndroidButton implements Button{
    @Override
    public void sayHi() {
        System.out.println("Hi i am android button");
    }
}
