package oop.hus.lab6.animal;

public class TestMain {
    public static void main(String[] args) {
        Animal animal = new Animal("cat");
        System.out.println("Animal: " + animal);

        Mammal mammal = new Mammal("mammal");
        System.out.println("Mammal: " + mammal);

        Cat cat = new Cat("cat");
        System.out.println("Cat: " + cat);
        cat.greets();

        Dog dog = new Dog("Dog");
        System.out.println("Dog: " + dog);
        dog.greets();
        dog.greets(new Dog("ford"));
    }
}
