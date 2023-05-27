package oop.hus.lab11.factorymethod.simplefactory;

public class FruitSimpleFactory {
    Fruit provideFruit(String type) {
        if (type.equals("Apple")) {
            return new Apple();
        }
        if (type.equals("Banana")) {
            return new Banana();
        }
        if (type.equals("Orange")) {
            return new Orange();
        }
        return null;
    }

}
