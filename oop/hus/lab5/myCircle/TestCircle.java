package oop.hus.lab5.myCircle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The circle has radius of " + circle1.getRadius() + " and area of " + circle1.getArea());

        Circle circle2 = new Circle(2.0);
        System.out.println("The circle has radius " + circle2.getRadius() + " and area of " + circle2.getArea());

        Circle circle4 = new Circle(); // construct an instance of Circle
        circle4.setRadius(5.5); //change radius
        System.out.println("radius is: " + circle4.getRadius()); // Print radius via getter
        circle4.setColor("green"); // change color
        System.out.println("color is: " + circle4.getColor()); //Print color via getter

        Circle circle5 = new Circle(5.5);
        System.out.println(circle5.toString()); // explicit call

        Circle circle6 = new Circle(6.6);
        System.out.println(circle6.toString());
        System.out.println(circle6);
        System.out.println("Operator '+' invokes toString() too: " + circle6);
    }

}
