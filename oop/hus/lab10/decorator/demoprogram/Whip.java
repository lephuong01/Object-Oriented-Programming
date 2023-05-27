package oop.hus.lab10.decorator.demoprogram;

public class Whip extends CondimentDecorate {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.3;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + "Whip";
    }
}
