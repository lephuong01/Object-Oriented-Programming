package oop.hus.lab7.animal2;

public class Dog extends Animal {
    public void greeting() {
        System.out.println("Woof!");
    }

    public void greeting(Dog another) {
        System.out.println("Woooooowwwwf!");
    }
}
