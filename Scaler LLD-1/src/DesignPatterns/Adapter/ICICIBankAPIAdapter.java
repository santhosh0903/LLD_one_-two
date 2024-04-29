package DesignPatterns.Adapter;

import DesignPatterns.Adapter.BankAPIAdapter;
import DesignPatterns.Adapter.ThirdParty.icicbank.IcicBankAPI;

public class ICICIBankAPIAdapter implements BankAPIAdapter {

    private IcicBankAPI icicBankAPI=new IcicBankAPI();
    @Override
    public double getBalance(String accountNumber) {
        return 10;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
