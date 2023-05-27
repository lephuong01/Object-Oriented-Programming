package oop.hus.lab11.factorymethod.structure;

public class FactoryMethodTestDrive {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.createProduct();
        System.out.println(productA);


        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.createProduct();
        System.out.println(productB);
        productB.doStuff();
    }
}
