package oop.hus.lab10.decorator.icecream;

public class DecoratorTestDrive {
    public static void main(String[] args) {
        IceCream vani = new VaniIceCream();
        System.out.println(vani.getDescription());
        System.out.println(vani.cost());

        vani = new HoneyTopping(vani);
        System.out.println(vani.getDescription());
        System.out.println(vani.cost());

        vani = new NutsTopping(vani);
        System.out.println(vani.getDescription());
        System.out.println(vani.cost());

        vani = new HoneyTopping(vani);
        System.out.println(vani.getDescription());
        System.out.println(vani.cost());

    }
}
