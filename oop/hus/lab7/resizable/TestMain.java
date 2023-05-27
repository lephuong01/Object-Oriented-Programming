package oop.hus.lab7.resizable;

public class TestMain {
    public static void main(String[] args) {
        GeometricObject geometricObject = new Circle(5.0);
        System.out.println(geometricObject);
        System.out.println(geometricObject.getArea());
        System.out.println(geometricObject.getPerimeter());

        Resizable resizable = new ResizableCircle(5.0);
        System.out.println(resizable);


        Circle resizableCircle = (Circle) resizable;
        System.out.println(resizableCircle);
        System.out.println(resizableCircle.getArea());
        System.out.println(resizableCircle.getPerimeter());
    }
}
