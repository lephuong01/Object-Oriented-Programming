package oop.hus.lab11.factorymethod.structure;

public class ConcreteProductA implements Product {
    @Override
    public void doStuff() {
        System.out.println("Product A do stuff!");
    }

    @Override
    public String toString() {
        return "ProductA";
    }
}
