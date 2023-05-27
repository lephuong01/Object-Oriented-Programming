package oop.hus.lab6.line;

public class TestLine {
    public static void main(String[] args) {
        Line line1 = new Line(0, 0, 3, 4);
        System.out.println(line1);

        Point point1 = new Point(3, 4);
        Point point2 = new Point(5, 6);
        Line line2 = new Line(point1, point2);
        System.out.println(line2);
    }
}
