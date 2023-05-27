package oop.hus.lab10.decorator.demoprogram;

public class Mocha extends CondimentDecorate {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.7;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + "Mocha";
    }
}
