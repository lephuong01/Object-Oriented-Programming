package oop.hus.lab10.adapter.demoprogram;

public class TurkeyAdaptor implements Duck {
    private Turkey turkey;

    public TurkeyAdaptor(Turkey turkey) {
        this.turkey = turkey;
    }

    public Turkey getTurkey() {
        return turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}