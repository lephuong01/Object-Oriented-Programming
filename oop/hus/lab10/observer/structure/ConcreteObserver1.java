package oop.hus.lab10.observer.structure;

public class ConcreteObserver1 implements MyObserver {
    private Subject subject;

    public ConcreteObserver1(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(int newData) {
        System.out.println("Concrete observer 1 update");
    }
}
