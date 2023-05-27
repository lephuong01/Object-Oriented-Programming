package oop.hus.lab7.movable3;

public class MovableCircle implements Movable {
    private int radius;
    private Movable center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super();
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle[" + center.toString() + ", radius=" + radius + "]";
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }
}
