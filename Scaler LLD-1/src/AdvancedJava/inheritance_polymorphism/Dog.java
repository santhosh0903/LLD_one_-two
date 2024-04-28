package AdvancedJava.inheritance_polymorphism;

public class Dog extends  Animal {


    Dog(){
        age=20;
    }

    void getType(){
        System.out.println("I am german");
    }

    void  getType(int x){
        System.out.println(" I am indie"+ x);
    }

    //Method overriding or runtime polymorphism
    @Override
    void getAge() {

        System.out.println("Dog's age is: "+ age);
    }
}
