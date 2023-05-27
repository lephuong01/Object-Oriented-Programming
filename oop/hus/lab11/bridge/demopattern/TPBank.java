package oop.hus.lab11.bridge.demopattern;

public class TPBank extends Bank {

    public TPBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.print("Open your account ar TPBank is a ");
        account.openAccount();
    }
}
