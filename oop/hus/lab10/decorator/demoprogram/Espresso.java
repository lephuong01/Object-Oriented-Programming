package oop.hus.lab10.decorator.demoprogram;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 2;
    }
}
