package oop.hus.lab7.geometricObject;

public class Rectangle implements GeometricObject {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle[" + "width=" + width + ",length=" + length + ']';
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
}
