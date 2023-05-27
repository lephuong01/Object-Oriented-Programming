package oop.hus.lab11.builderpattern.pseudocode;

public class Director {
    public void constructSportCar(Builder builder) {
        builder.reset()
                .setSeats(1)
                .setEnginee(new Enginee(3.0, 0))
                .setTripComputer(new TripComputer())
                .setGPS(new GPS());
    }

    public void constructSUV(Builder builder) {
        builder.reset()
                .setSeats(4)
                .setEnginee(new Enginee(2.5, 0))
                .setGPS(new GPS());
    }
}
