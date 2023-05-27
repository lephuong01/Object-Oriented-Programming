package oop.hus.lab11.builderpattern.pseudocode;

public class Application {
    public static void main(String[] args) {
        makeCar();
    }

    public static void makeCar() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);
        Car car = carBuilder.getProduct();
        car.getEnginee().on();
        car.getTripComputer().showStatus();
        car.getEnginee().go(19);
        car.getEnginee().off();
        System.out.println(car.getGps().getRoute());

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportCar(carManualBuilder);

        Manual manual = carManualBuilder.getProduct();
        System.out.println(manual.print());

        System.out.println("\n");
        Director director1 = new Director();
        CarBuilder carBuilder1 = new CarBuilder();
        director1.constructSUV(carBuilder1);
        Car car1 = carBuilder1.getProduct();
        car1.getEnginee().getMileage();
        car1.getGps().getRoute();

        CarManualBuilder carManualBuilder1 = new CarManualBuilder();
        director1.constructSUV(carManualBuilder1);

        Manual manual1 = carManualBuilder1.getProduct();
        System.out.println(manual1.print());
    }
}
