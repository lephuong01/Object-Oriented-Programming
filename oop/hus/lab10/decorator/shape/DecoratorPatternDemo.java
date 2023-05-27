package oop.hus.lab10.decorator.shape;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorate(new Circle());

        Shape redRactangle = new RedShapeDecorate(new Rectangle());
        System.out.println("Circle with normal border: ");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRactangle.draw();
    }
}
