package AdvancedJava.exceptionHandling;

public class Client {

    public static void main(String[] args){
        Doer doer=new Doer();
//        doer.doWork();

        try {
            doer.findStudentByRoll(51);
        }catch (OddNumberException ex){
            System.out.println("odd number exception");
        }catch (EvenNumberException ex){
            System.out.println("Even number exception");
        }finally {
            System.out.println("last but not least");
        }
    }
}
