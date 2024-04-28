package AdvancedJava.concurrency;

public class Main {
    public static void main(String[] args) {
//
//        System.out.println("Main thread "+Thread.currentThread().getName());
//
//        HelloWorldPrinter hwp=new HelloWorldPrinter();
//
//        Thread t1=new Thread(hwp);
//        t1.start();
//
//        System.out.println("Main end "+Thread.currentThread().getName());

        for(int i=1;i<=100;i++){

            NumberPrinter np=new NumberPrinter(i);

            Thread t=new Thread(np);
            t.start();

        }

    }
}
