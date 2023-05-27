package oop.hus.lab7.movable;

public class TestMovable {
    public static void main(String[] args) {
        Movable movable1 = new MovablePoint(2, 3, 4, 5);
        System.out.println(movable1);
        movable1.moveUp();
        System.out.println(movable1);
        movable1.moveDown();
        System.out.println(movable1);
        movable1.moveLeft();
        System.out.println(movable1);
        movable1.moveRight();
        System.out.println(movable1);
    }
}
