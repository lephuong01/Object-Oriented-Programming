package oop.hus.lab10.strategy.demoprogram;

import java.util.Random;

public class StrategyTestDrive {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 1; i <= 5; i++) {
            Ticket ticket = new Ticket();
            ticket.setName("Ticket " + i);
            ticket.setPrice(50);
            generatePromoteStrategy(random, ticket);
            System.out.println("Promoted price of " +
                    ticket.getName() +
                    " is " +
                    ticket.getPromotedPrice() + " " +
                    ticket.getPromoteStrategy().getType());
        }
    }

    public static void generatePromoteStrategy(Random random, Ticket ticket) {
        int strategyIndex = random.nextInt(0, 3);
        switch (strategyIndex) {
            case 0:
                ticket.setPromoteStrategy(new NoDiscountStrategy());
                break;
            case 1:
                ticket.setPromoteStrategy(new HalfDiscountStrategy());
                break;
            default:
                ticket.setPromoteStrategy(new QuarterDiscountStrategy());
                break;
        }
    }
}
