package oop.hus.lab11.abstractfactory.exercise2;

public class Client {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.WOOD);
        Chair chair = factory.createChair();
        chair.create();

        Table table = factory.createTable();
        table.create();

        FurnitureAbstractFactory factory1 = FurnitureFactory.getFactory(MaterialType.FLASTIC);
        Chair chair1 = factory1.createChair();
        chair1.create();

        Table table1 = factory1.createTable();
        table1.create();
    }
}
