package oop.hus.lab10.observer.demoprogram;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer1 = new BinaryObserver(subject);
        Observer observer3 = new OctalObserver(subject);
        Observer observer2 = new HexaObserver(subject);

        System.out.println("state = 15");
        subject.setState(15);
        System.out.println("\nstate = 10");
        subject.setState(10);
    }
}
