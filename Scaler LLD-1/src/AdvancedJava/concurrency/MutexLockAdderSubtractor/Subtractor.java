package AdvancedJava.concurrency.MutexLockAdderSubtractor;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{

    private Count count;

    private Lock lock;
    Subtractor(Count count,Lock lock){
        this.count = count;
        this.lock=lock;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            lock.lock();
            System.out.println("Subtractor Thread"+Thread.currentThread().getName());
            count.val -= i;
            lock.unlock();
        }
    }
}
