package AdvancedJava.concurrency.synchronisedKeyword;

public class Subtractor implements Runnable{

    private Count count;

    Subtractor(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {

            synchronized (count){
                System.out.println("Subtractor Thread"+Thread.currentThread().getName());
                count.val -= i;
            }

        }
    }
}
