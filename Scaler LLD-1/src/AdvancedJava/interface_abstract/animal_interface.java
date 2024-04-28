package AdvancedJava.interface_abstract;

public class animal_interface implements Animal {
    @Override
    public void walk() {
        System.out.println("I am dog and can walk with 4 legs");
    }

    @Override
    public void eat() {
        System.out.println("I am dog and can eat without my hands");
    }

    @Override
    public void breath() {

        System.out.println("I am dog and can breath with my nose");

    }
}

interface Animal{

    void walk();
    void eat();

    default void breath(){
        System.out.println("I am breathing");
    }

    static void drink(){
        System.out.println("I am drinking");
    }
}
