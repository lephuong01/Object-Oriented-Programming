package oop.hus.lab10.decorator.icecream;

public class VaniIceCream implements IceCream {
    private String description;
    private int price;

    public VaniIceCream() {
        this.price = 1;
        this.description = "Vani";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int cost() {
        return this.price;
    }

}
