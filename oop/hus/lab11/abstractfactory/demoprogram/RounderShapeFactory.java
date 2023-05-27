package oop.hus.lab11.abstractfactory.demoprogram;

public class RounderShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeStyle) {
        if (shapeStyle.equalsIgnoreCase("rectangle")) {
            return new RounderRectangle();
        } else if (shapeStyle.equalsIgnoreCase("square")) {
            return new RounderSquare();
        }
        return null;
    }
}
