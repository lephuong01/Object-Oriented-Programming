package oop.hus.lab11.factorymethod.factorymethodfruit;

public class FruitFatoryA extends FruitFactory {
    @Override
    public Fruit provideFruit(String type) {
        if (type.equals("Apple")) {
            return new AppleA();
        }

        if (type.equals("Orange")) {
            return new OrangeA();
        }
        return null;
    }

}
