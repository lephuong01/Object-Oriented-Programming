package oop.hus.lab10.decorator.demoprogram;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 1;
    }
}
