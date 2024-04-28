package AdvancedJava.concurrency.ExecutorsCallables;

public class PrintNumber implements Runnable {

    int getNumber;

    PrintNumber(int num){
        this.getNumber=num;
    }

    @Override
    public void run() {
        System.out.println("The number "+getNumber+" is printed by "+Thread.currentThread().getName());
    }
}
