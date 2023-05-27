package oop.hus.lab11.visitor.pseudocode;

public class Rectangle implements Shape {
    int x;
    int y;
    int height;
    int width;

    public Rectangle(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.println("(" + x + ", " + y + ")");
    }

    @Override
    public String accept(Visitor v) {
        return v.visitRectangle(this);
    }
}
