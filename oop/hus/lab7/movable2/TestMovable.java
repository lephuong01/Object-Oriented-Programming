package oop.hus.lab7.movable2;

public class TestMovable {
    public static void main(String[] args) {
        Movable movableCircle = new MovableCircle(2, 3, 4, 5, 8);
        System.out.println(movableCircle);
        movableCircle.moveDown();
        System.out.println(movableCircle);
        movableCircle.moveLeft();
        System.out.println(movableCircle);
        movableCircle.moveRight();
        System.out.println(movableCircle);
        movableCircle.moveUp();
        System.out.println(movableCircle);
    }
}
