package oop.hus.lab10.decorator.demoprogram;

public class Milk extends CondimentDecorate {
    public Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + "Milk";
    }
}
