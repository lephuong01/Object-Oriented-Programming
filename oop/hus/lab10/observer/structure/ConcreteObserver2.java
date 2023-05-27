package oop.hus.lab10.observer.structure;

public class ConcreteObserver2 implements MyObserver {
    @Override
    public void update(int newData) {
        System.out.println("Concrete observer 2 update");
    }
}
