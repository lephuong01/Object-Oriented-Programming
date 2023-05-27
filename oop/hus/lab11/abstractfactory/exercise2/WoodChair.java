package oop.hus.lab11.abstractfactory.exercise2;

public class WoodChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create wood chair");
    }
}
