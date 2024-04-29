package DesignPatterns.Adapter;

public class Client {

    public static void main(String[] args) {
//        PhonePe phonePe=new PhonePe(new ICICIBankAPIAdapter());
        PhonePe phonePe=new PhonePe(new YesBankAPIAdapter());
        System.out.println(phonePe.getBanlance());
    }
}
