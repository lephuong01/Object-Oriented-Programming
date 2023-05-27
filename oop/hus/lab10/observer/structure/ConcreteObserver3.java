package oop.hus.lab10.observer.structure;

public class ConcreteObserver3 implements MyObserver {
    @Override
    public void update(int newData) {
        System.out.println("Concrete Observer 3 update");
    }
}
