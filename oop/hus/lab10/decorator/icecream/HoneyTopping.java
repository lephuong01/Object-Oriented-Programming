package oop.hus.lab10.decorator.icecream;

public class HoneyTopping extends ToppingDecorator {

    private int price;
    private String description;

    public HoneyTopping(IceCream swappee) {
        super(swappee);
        this.price = 1;
        this.description = "Honey";
    }

    public String getDescription() {
        return this.swappee.getDescription() + " " + this.description;
    }

    public int cost() {
        return this.swappee.cost() + this.price;
    }
}
