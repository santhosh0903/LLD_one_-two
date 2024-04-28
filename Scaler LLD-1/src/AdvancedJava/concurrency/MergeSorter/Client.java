package AdvancedJava.concurrency.MergeSorter;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//
//        List<Integer> list=List.of(7,6,5,4,3,1,2);
//
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        MergeSort sorter = new MergeSort(list, executorService);
//        Future<List<Integer>> sortedListFuture = executorService.submit(sorter);
//
//        List<Integer> sortedList = sortedListFuture.get();
//        System.out.println(sortedList);
//
//        executorService.shutdown();

        List<Integer> list = List.of(7, 3, 4, 1, 9, 8, 2, 6);

        // THIS CODE IS NOT MULTITHREADED

//        MergeSorter sorter = new MergeSorter(list);
//        List<Integer> sortedList = sorter.call();
//        System.out.println(sortedList);


        //CANT WORK WITHOUT FUTURE

        //WORKING CODE
        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSort sorter = new MergeSort(list, executorService);
        Future<List<Integer>> sortedListFuture = executorService.submit(sorter);

        List<Integer> sortedList = sortedListFuture.get();
        System.out.println(sortedList);

        executorService.shutdown();
    }
}
