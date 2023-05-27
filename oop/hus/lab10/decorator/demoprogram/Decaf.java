package oop.hus.lab10.decorator.demoprogram;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 2.5;
    }
}
