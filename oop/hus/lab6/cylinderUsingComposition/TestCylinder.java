package oop.hus.lab6.cylinderUsingComposition;

public class TestCylinder {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.0, "red");
        Cylinder cylinder1 = new Cylinder(circle1, 5.0);
        System.out.println("Area: " + cylinder1.getArea());
        System.out.println(cylinder1);

        Circle circle2 = new Circle(4.0, "blue");
        cylinder1.setBase(circle2);
        System.out.println(cylinder1.toString());
        System.out.println("volume: " + cylinder1.getVolume());
    }
}
