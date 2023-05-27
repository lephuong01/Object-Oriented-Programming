package oop.hus.lab10.strategy.demoprogram;

public class QuarterDiscountStrategy implements PromoteStrategy{
    @Override
    public double doDiscount(double price) {
        return price * 0.75;
    }

    @Override
    public String getType() {
        return "QuarterDiscountStrategy";
    }


}
