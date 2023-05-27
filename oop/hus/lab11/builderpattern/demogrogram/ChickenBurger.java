package oop.hus.lab11.builderpattern.demogrogram;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 40.0f;
    }
}
