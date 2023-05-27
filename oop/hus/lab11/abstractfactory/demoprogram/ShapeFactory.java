package oop.hus.lab11.abstractfactory.demoprogram;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeStyle) {
        if (shapeStyle.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeStyle.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}
