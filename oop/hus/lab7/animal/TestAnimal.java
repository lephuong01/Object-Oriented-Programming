package oop.hus.lab7.animal;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat("Meo");
        cat.greets();

        Dog dog = new Dog("Ki");
        dog.greets();
        Dog dog1 = new Dog("dog");
        dog.greets(dog1);

        BigDog bigDog = new BigDog("big dog");
        bigDog.greets();
        BigDog bigDog1 = new BigDog("big dog1");
        bigDog.greets(bigDog1);
        bigDog1.greets(dog);

        Dog dog2 = (Dog) bigDog;
        dog2.greets();
        dog2.greets(bigDog1);
    }
}
