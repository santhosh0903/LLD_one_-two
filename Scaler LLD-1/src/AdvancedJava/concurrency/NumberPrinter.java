package AdvancedJava.concurrency;

public class NumberPrinter implements  Runnable {

    int getNumber;

    NumberPrinter(int num){
        this.getNumber=num;
    }

    @Override
    public void run() {
        System.out.println("The number "+getNumber+" is printed by "+Thread.currentThread().getName());
    }
}
