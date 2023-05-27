package oop.hus.lab7.animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }
}
