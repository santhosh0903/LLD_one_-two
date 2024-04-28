package AdvancedJava.Generis;

public class Client {
    public static void main(String[] args) {

//        Utilities ut=new Utilities();
//        ut.doSomething("Raju", "is here", 3);
//        ut.doSomething(1,2,3);

        Utilities ut=new Utilities();
        ut.doSomething("a","b",2,3);
        Utilities.doSomething(1,2,3);

    }
}
