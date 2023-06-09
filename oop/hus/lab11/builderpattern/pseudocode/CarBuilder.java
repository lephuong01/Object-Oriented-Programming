package oop.hus.lab11.builderpattern.pseudocode;

import oop.hus.lab11.abstractfactory.pseudocode.Checkbox;

public class CarBuilder implements Builder {
    private Car car;

    @Override
    public Builder reset() {
        car = new Car();
        return this;
    }

    @Override
    public Builder setSeats(int number) {
        car.setSeats(number);
        return this;
    }

    @Override
    public Builder setEnginee(Enginee enginee) {
        car.setEnginee(enginee);
        return this;
    }

    @Override
    public Builder setTripComputer(TripComputer tripComputer) {
        car.setTripComputer(tripComputer);
        tripComputer.setCar(car);
        return this;
    }

    @Override
    public Builder setGPS(GPS gps) {
        car.setGps(gps);
        return this;
    }

    public Car getProduct() {
        Car product = car;
        reset();
        return product;
    }
}
