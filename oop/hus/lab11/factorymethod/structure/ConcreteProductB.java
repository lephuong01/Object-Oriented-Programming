package oop.hus.lab11.factorymethod.structure;

public class ConcreteProductB implements Product {
    @Override
    public void doStuff() {
        System.out.println("Product B do stuff!");
    }

    @Override
    public String toString() {
        return "ProductB";
    }
}
