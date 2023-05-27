package oop.hus.lab10.decorator.demoprogram;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 3;
    }
}
