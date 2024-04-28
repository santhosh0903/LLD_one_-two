package DesignPatterns.SingletonDesign;

public class MyRunnable implements Runnable {

    @Override
    public void run() {

        DatabaseConnectionMultiThreading dcmt=DatabaseConnectionMultiThreading.getInstance();

    }
}
