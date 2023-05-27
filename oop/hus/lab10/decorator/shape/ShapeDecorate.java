package oop.hus.lab10.decorator.shape;

public abstract class ShapeDecorate implements Shape {
    Shape shape;

    public ShapeDecorate(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }
}
