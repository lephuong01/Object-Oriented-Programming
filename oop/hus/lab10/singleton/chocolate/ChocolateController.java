package oop.hus.lab10.singleton.chocolate;

public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getInstance();

        ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getInstance();

        System.out.println(chocolateBoiler1);
        System.out.println(chocolateBoiler1);

        if (chocolateBoiler1 == chocolateBoiler2) {
            System.out.println("True");
        } else {
            System.out.println(chocolateBoiler2);
            System.out.println("False");
        }
    }
}
