package oop.hus.lab10.decorator.demoprogram;

public abstract class Beverage {
    String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
