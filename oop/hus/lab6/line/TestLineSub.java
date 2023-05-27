package oop.hus.lab6.line;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub lineSub1 = new LineSub(10, 20, 30, 40);
        System.out.println("Length: " + lineSub1.getLength());
        System.out.println("Gradient: " +lineSub1.getGradient());

        Point point1 = new Point(10, 20);
        Point point2 = new Point(30, 40);
        LineSub lineSub2 = new LineSub(point1, point2);
        System.out.println("Length: " + lineSub2.getLength());
        System.out.println("Gradient: "+ lineSub2.getGradient());

    }
}
