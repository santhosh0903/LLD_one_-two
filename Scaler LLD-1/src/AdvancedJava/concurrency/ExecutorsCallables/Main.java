package AdvancedJava.concurrency.ExecutorsCallables;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

//        ExecutorService es= Executors.newFixedThreadPool(1);
//        ExecutorService es= Executors.newSingleThreadExecutor();
        ExecutorService es= Executors.newCachedThreadPool();

        for(int i=1;i<=100;i++){

            PrintNumber pn=new PrintNumber(i);
            es.execute(pn);

        }

        es.shutdown();

    }



}
