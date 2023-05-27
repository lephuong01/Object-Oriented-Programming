package oop.hus.lab11.factorymethod.simplefactory;

public class Banana implements Fruit{
    @Override
    public void produceJuice() {
        System.out.println("Produce Banana Juice!");
    }

    @Override
    public String toString() {
        return "Banana";
    }
}
