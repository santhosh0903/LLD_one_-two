package DesignPatterns.SingletonDesign;

public class Client {
    public static void main(String[] args) {

//        System.out.println(DatabaseConnection.getInstance());


        Thread[] threads=new Thread[10];

        for(int i=0;i<10;i++){
            threads[i]=new Thread(new MyRunnable());
            threads[i].start();
        }

    }
}

