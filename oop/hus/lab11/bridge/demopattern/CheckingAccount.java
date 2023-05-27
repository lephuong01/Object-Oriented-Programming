package oop.hus.lab11.bridge.demopattern;


public class CheckingAccount implements Account {
    @Override
    public void openAccount() {
        System.out.println("Checking Account!");
    }
}
