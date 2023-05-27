package oop.hus.lab11.command.example;

public class CommandTestDrive {
    public static void main(String[] args) {
        Account account = new Account("VietcomBank");

        Command open = new OpenAccount(account);
        Command close = new CloseAccount(account);
        BankApp bankApp = new BankApp(open, close);

        bankApp.clickOpenAccount();
        bankApp.clickCloseAccount();
    }
}
