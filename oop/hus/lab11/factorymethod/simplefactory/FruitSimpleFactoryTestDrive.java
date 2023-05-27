package oop.hus.lab11.factorymethod.simplefactory;

public class FruitSimpleFactoryTestDrive {
    public static void main(String[] args) {
        FruitSimpleFactory factory = new FruitSimpleFactory();
        Fruit apple = factory.provideFruit("Apple");
        System.out.println(apple);
        Fruit banana = factory.provideFruit("Banana");
        System.out.println(banana);
        Fruit orange = factory.provideFruit("Orange");
        System.out.println(orange);
    }
}
