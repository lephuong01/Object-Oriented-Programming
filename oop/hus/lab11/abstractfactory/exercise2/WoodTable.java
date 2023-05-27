package oop.hus.lab11.abstractfactory.exercise2;

public class WoodTable implements Table {
    @Override
    public void create() {
        System.out.println("Create wood table");
    }
}
