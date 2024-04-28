package AdvancedJava.interface_abstract;

public class Main {

    public static void main(String[] args) {

//        animal_interface dog=new animal_interface();
//        dog.eat();
//        dog.walk();
//        dog.breath();
        Animal a=new animal_interface();
        a.eat();
        a.walk();
        a.breath();
        Animal.drink();

        animal_abstract ab=new dog();
        ab.eat();
        ab.walk();

    }
}
