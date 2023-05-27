package oop.hus.lab11.factorymethod.simplefactory;

public class Orange implements Fruit {
    @Override
    public void produceJuice() {
        System.out.println("Produce Orange Juice!");
    }

    @Override
    public String toString() {
        return "Orange";
    }
}
