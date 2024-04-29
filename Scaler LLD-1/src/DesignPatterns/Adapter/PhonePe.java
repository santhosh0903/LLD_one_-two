package DesignPatterns.Adapter;

public class PhonePe {

    private BankAPIAdapter bankAPI;

    public  PhonePe(BankAPIAdapter bankAPI){
        this.bankAPI=bankAPI;
    }

    double getBanlance(){
        double currBalance=bankAPI.getBalance("accountNumber");
        return  currBalance*2;
    }

}
