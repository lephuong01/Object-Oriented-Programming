package oop.hus.lab11.abstractfactory.demoprogram;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory nonRoundFactory = FactoryProducer.getFactory(false);
        Shape shape1 = nonRoundFactory.getShape("rectangle");
        shape1.draw();

        Shape shape2 = nonRoundFactory.getShape("square");
        shape2.draw();

        AbstractFactory roundFactory = FactoryProducer.getFactory(true);
        Shape shape3 = roundFactory.getShape("rectangle");
        shape3.draw();

        Shape shape4 = roundFactory.getShape("square");
        shape4.draw();
    }
}
