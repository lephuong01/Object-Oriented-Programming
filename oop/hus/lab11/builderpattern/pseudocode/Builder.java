package oop.hus.lab11.builderpattern.pseudocode;

public interface Builder {
    Builder reset();

    Builder setSeats(int number);

    Builder setEnginee(Enginee enginee);

    Builder setTripComputer(TripComputer number);

    Builder setGPS(GPS gps);
}
