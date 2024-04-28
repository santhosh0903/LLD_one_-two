package AdvancedJava.inheritance_polymorphism;

public class Main {
    public static void main(String[] args) {

        Dog d=new Dog();
        Animal a=new Dog();
        Animal an=new Animal();
        a.getAge();
        an.getAge();

        d.getAge();
        d.getType();
        d.getType(10);

    }
}
