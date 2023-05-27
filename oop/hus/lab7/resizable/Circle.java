package oop.hus.lab7.resizable;

public class Circle implements GeometricObject {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[" + "radius=" + radius + ']';
    }

    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
