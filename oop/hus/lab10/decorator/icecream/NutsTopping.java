package oop.hus.lab10.decorator.icecream;

public class NutsTopping extends ToppingDecorator {
    private int price;
    private String description;

    public NutsTopping(IceCream swappee) {
        super(swappee);
        this.price = 2;
        this.description = "Nust";
    }

    public String getDescription() {
        return this.swappee.getDescription() + " " + this.description;
    }

    public int cost() {
        return this.swappee.cost() + this.price;
    }
}
