package DesignPatterns.SingletonDesign;

public class DatabaseConnectionMultiThreading {

    private static DatabaseConnectionMultiThreading instance=null;


    public static  DatabaseConnectionMultiThreading getInstance(){
            //double check for fast performance and to handle multiple threads
            if(instance==null){
                synchronized (DatabaseConnectionMultiThreading.class){
                    if(instance==null){
                        instance=new DatabaseConnectionMultiThreading();
                        System.out.println(instance);
                    }
                }
            }

        return instance;

    }
}
