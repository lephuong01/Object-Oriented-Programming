package oop.hus.lab11.builderpattern.pseudocode;

public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showStatus() {
        if (this.car.getEnginee().isStarted()) {
            System.out.println("Car is started!");
        } else {
            System.out.println("Car isn't started!");
        }
    }
}
