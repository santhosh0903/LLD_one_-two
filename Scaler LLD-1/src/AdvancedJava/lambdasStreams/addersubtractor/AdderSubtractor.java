package AdvancedJava.lambdasStreams.addersubtractor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AdderSubtractor {
    public static void main(String[] args) throws InterruptedException {

        Count c=new Count();
        Lock lock=new ReentrantLock();
        Runnable adder=()->{
            for(int i=0;i<10000;i++){
               lock.lock();
               c.value+=1;
               lock.unlock();
            }
        };

        Runnable sutractor=()->{
            for (int i=0;i<10000;i++){
                lock.lock();
                c.value-=1;
                lock.unlock();
            }
        };

        Thread t1=new Thread(adder);
        t1.start();

        Thread t2=new Thread(sutractor);
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.value);
    }
}
