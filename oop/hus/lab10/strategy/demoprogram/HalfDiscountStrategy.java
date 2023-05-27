package oop.hus.lab10.strategy.demoprogram;

public class HalfDiscountStrategy implements PromoteStrategy{
    @Override
    public double doDiscount(double price) {
        return price * 0.5;
    }

    @Override
    public String getType() {
        return "HalfDiscountStrategy";
    }
}
