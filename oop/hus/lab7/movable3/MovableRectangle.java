package oop.hus.lab7.movable3;

public class MovableRectangle implements Movable {
    Movable topLeft;
    Movable topRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        super();
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        topRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle[" + "topLeft=" + topLeft + ", topRight=" + topRight + ']';
    }

    public void moveUp() {
        topLeft.moveUp();
        topRight.moveUp();
    }

    public void moveDown() {
        topLeft.moveDown();
        topRight.moveDown();
    }

    public void moveLeft() {
        topLeft.moveLeft();
        topRight.moveLeft();
    }

    public void moveRight() {
        topLeft.moveRight();
        topRight.moveRight();
    }
}
