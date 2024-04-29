package DesignPatterns.Adapter;

import DesignPatterns.Adapter.BankAPIAdapter;
import DesignPatterns.Adapter.ThirdParty.yesbank.YesBankAPI;

public class YesBankAPIAdapter implements BankAPIAdapter {
    
    YesBankAPI yesBankAPI=new YesBankAPI();
    @Override
    public double getBalance(String accountNumber) {
        return 20;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
