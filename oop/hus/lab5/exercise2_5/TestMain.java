package oop.hus.lab5.exercise2_5;

public class TestMain {
    public static void main(String[] args) {
        // Test Customer class
        Customer customer = new Customer(88, "Tan Ah Teck", 'm');
        System.out.println(customer);
        System.out.println("id is: " + customer.getID());
        System.out.println("name is: " + customer.getName());
        System.out.println("gender is: " + customer.getGender());

        // Test Account class
        Account account = new Account(10, customer, 12);
        System.out.println(account);
        System.out.println("id is: " + account.getID());
        System.out.println("balance is: " + account.getBalance());
        System.out.println("customer's name is: " + account.getCustomerName());
        System.out.println("diposit is: " + account.deposit(10));
        System.out.println("withdraw is: " + account.withdraw(6));
    }


}
