package DesignPatterns.SingletonDesign;

public class DatabaseConnection {

    //Below line is for eager loading
    //private static DatabaseConnection instance=new DatabaseConnection();

    private static DatabaseConnection instance;
    private DatabaseConnection(){

    }

      //This is for single threaded environment
    public static DatabaseConnection getInstance(){
        if(instance==null){
            instance=new DatabaseConnection();
        }
        return instance;

    }


}
