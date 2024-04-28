package AdvancedJava.concurrency.synchronisedmethod;

public class Subtractor implements Runnable{

    private Count count;

    Subtractor(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {

            System.out.println("Subtractor Thread"+Thread.currentThread().getName());
            count.offSet(-i);
        }
    }
}
