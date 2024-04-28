package AdvancedJava.concurrency.MutexLockAdderSubtractor;

import AdvancedJava.concurrency.ExecutorsCallables.PrintNumber;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    private Count count;
    private Lock lock;
    Adder(Count count,Lock lock){
        this.count = count;
        this.lock=lock;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            lock.lock();
            System.out.println("Adder Thread"+Thread.currentThread().getName());
            count.val += i;
            lock.unlock();
        }
    }

}

