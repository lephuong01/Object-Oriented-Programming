package oop.hus.lab11.factorymethod.factorymethodfruit;

public class FruitFactoryTestDrive {
    public static void main(String[] args) {
        FruitFactory factoryA = new FruitFatoryA();
        Fruit appleA = factoryA.provideFruit("Apple");
        Fruit orangeA = factoryA.provideFruit("Orange");
        orangeA.produceJuice();
        appleA.produceJuice();

        FruitFactory factoryB = new FruitFactoryB();
        Fruit appleB = factoryB.provideFruit("Apple");
        Fruit orangeB = factoryB.provideFruit("Orange");
        appleB.produceJuice();
        orangeB.produceJuice();
    }
}
