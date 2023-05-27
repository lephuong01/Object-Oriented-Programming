package oop.hus.lab10.adapter.demoprogram;

public class DuckSimulator {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        turkey.gobble();
        turkey.fly();

        Duck turkeyAdaptor = new TurkeyAdaptor(turkey);
        turkeyAdaptor.quack();
        turkeyAdaptor.fly();
    }
}
