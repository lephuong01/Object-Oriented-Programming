package oop.hus.lab10.singleton.demoprogram;

public class Application {
    public static void main(String[] args) {
        Ball ball = Ball.getInstance("red");
        System.out.println(ball.getColor());

        Ball ball1 = Ball.getInstance("blue");
        System.out.println(ball1.getColor());

        Ball ball2 = Ball.getInstance("green");
        System.out.println(ball2.getColor());
    }
}
