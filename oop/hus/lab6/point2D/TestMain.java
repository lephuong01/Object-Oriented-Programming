package oop.hus.lab6.point2D;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1.0f, 2.0f);
        System.out.println(point2D);
        point2D.setY(10.0f);
        System.out.println(Arrays.toString(point2D.getXY()));
        point2D.setXY(12f, 13f);
        System.out.println(point2D);

        Point3D point3D = new Point3D(1.5f, 2.0f, 3.0f);
        System.out.println(point3D);
        point3D.setXYZ(4.4f, 4.5f, 4.6f);
        System.out.println(point3D);
        point3D.setZ(8.0f);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
