package oop.hus.lab11.builderpattern.pseudocode;

public class Car {
    private GPS Gps;
    private TripComputer tripComputer;
    private Enginee enginee;
    private int seats;


    public oop.hus.lab11.builderpattern.pseudocode.GPS getGps() {
        return Gps;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public Enginee getEnginee() {
        return enginee;
    }

    public int getSeats() {
        return seats;
    }

    public void setGps(oop.hus.lab11.builderpattern.pseudocode.GPS gps) {
        this.Gps = gps;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setEnginee(Enginee enginee) {
        this.enginee = enginee;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
