package oop.hus.lab10.observer.structure;

public class ObserversTestDrive {
    public static void main(String[] args) {
        Subject subject = new Subject();

        MyObserver observer1 = new ConcreteObserver1(subject);
        MyObserver observer2 = new ConcreteObserver2();
        MyObserver observer3 = new ConcreteObserver3();

        subject.registerObserver(observer2);
        subject.registerObserver(observer3);

        System.out.println(subject);
        subject.changeData(1);
        System.out.println(subject);
        System.out.println();
        subject.changeData(2);
        System.out.println(subject);

    }
}
