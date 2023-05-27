package oop.hus.lab11.abstractfactory.exercise2;

public class PlasticChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create plastic chair");
    }
}
