package AdvancedJava.concurrency.MutexLockAdderSubtractor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        Lock lock=new ReentrantLock();
        Count count = new Count();

        Adder adder = new Adder(count,lock);
        Subtractor subtractor = new Subtractor(count,lock);
        Thread t1 = new Thread(adder);
        t1.start();

        Thread t2 = new Thread(subtractor);
        t2.start();

        t1.join();
        t2.join();
        System.out.println(count.val);

    }
}
