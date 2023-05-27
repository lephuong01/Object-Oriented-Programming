package oop.hus.lab11.factorymethod.simplefactory;

public class Apple implements Fruit{
    @Override
    public void produceJuice() {
        System.out.println("Produce Apple Juice!");
    }

    @Override
    public String toString() {
        return "Apple";
    }
}
