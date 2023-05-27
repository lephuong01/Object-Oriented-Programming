package oop.hus.lab10.strategy.pay;

public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
