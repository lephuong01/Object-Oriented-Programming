package oop.hus.lab10.decorator.icecream;

public abstract class ToppingDecorator implements IceCream {
    protected IceCream swappee;

    public ToppingDecorator(IceCream swappee) {
        this.swappee = swappee;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public int cost() {
        return 0;
    }
}
