package oop.hus.lab7.geometricObject;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject geometricObject1 = new Circle(5.5);
        System.out.println(geometricObject1);
        System.out.println(geometricObject1.getArea());
        System.out.println(geometricObject1.getPerimeter());

        GeometricObject geometricObject2 = new Rectangle(3.0, 6.0);
        System.out.println(geometricObject2);
        System.out.println(geometricObject2.getArea());
        System.out.println(geometricObject2.getPerimeter());


        GeometricObject object1 = new Circle(3);

    }
}
