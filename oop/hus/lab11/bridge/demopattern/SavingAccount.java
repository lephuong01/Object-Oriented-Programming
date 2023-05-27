package oop.hus.lab11.bridge.demopattern;


public class SavingAccount implements Account {
    @Override
    public void openAccount() {
        System.out.println("Saving Account!");
    }
}
