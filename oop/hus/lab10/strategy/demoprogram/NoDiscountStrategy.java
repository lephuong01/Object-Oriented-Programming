package oop.hus.lab10.strategy.demoprogram;

public class NoDiscountStrategy implements PromoteStrategy{
    @Override
    public double doDiscount(double price) {
        return price;
    }

    @Override
    public String getType() {
        return "NoDisCountStrategy";
    }
}
