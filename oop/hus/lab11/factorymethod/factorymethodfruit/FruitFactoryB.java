package oop.hus.lab11.factorymethod.factorymethodfruit;

public class FruitFactoryB extends FruitFactory {

    @Override
    public Fruit provideFruit(String type) {
        if (type.equals("Apple")) {
            return new AppleB();
        }

        if (type.equals("Orange")) {
            return new OrangeB();
        }
        return null;
    }
}
