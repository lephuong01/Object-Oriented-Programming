package oop.hus.lab11.builderpattern.demogrogram;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Ver Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
