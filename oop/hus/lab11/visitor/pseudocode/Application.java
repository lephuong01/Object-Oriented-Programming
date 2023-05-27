package oop.hus.lab11.visitor.pseudocode;

import java.util.List;

public class Application {
    static List<Shape> shapes;

    public static void main(String[] args) {
        List<Shape> list = List.of(new Dot(0, 0), new Circle(5, 5, 2), new Rectangle(3, 3, 1, 1));
        shapes = List.of(new Dot(1, 1), new Circle(1, 2, 3), new Rectangle(1, 2, 4, 3), new CompoundShape(list));
        Visitor visitor = new XMLExportVisitor();
        for (Shape shape : shapes) {
            System.out.println(shape.accept(visitor) + "\n");
        }
    }
}
