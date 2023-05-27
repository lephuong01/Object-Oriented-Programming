package oop.hus.lab11.abstractfactory.demoprogram;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounder) {
        if (rounder) {
            return new RounderShapeFactory();
        }
        return new ShapeFactory();

    }
}
