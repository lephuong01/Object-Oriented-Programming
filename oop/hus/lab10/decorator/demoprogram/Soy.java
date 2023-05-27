package oop.hus.lab10.decorator.demoprogram;

public class Soy extends CondimentDecorate {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.4;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + "Soy";
    }
}
