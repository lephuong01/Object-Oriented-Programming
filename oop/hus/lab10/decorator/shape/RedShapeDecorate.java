package oop.hus.lab10.decorator.shape;

public class RedShapeDecorate extends ShapeDecorate{
    public RedShapeDecorate(Shape shape) {
        super(shape);
    }

    public void draw() {
        setRedBorder();
        shape.draw();
    }

    public void setRedBorder() {
        System.out.println("Red");
    }
}
