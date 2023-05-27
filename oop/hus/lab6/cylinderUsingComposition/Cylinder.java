package oop.hus.lab6.cylinderUsingComposition;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * Math.PI * base.getRadius() * height + 2 * base.getArea();
    }

    public double getVolume(){
        return base.getArea() * height;
    }


    @Override
    public String toString() {
        return "Cylinder[" + "base=" + base + ", height=" + height + ']';
    }
}
