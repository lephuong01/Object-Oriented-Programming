package oop.hus.lab11.builderpattern.pseudocode;

public class Manual {
    private int seats;
    private Enginee enginee;
    private TripComputer tripComputer;
    private GPS gps;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Enginee getEnginee() {
        return enginee;
    }

    public void setEnginee(Enginee enginee) {
        this.enginee = enginee;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public GPS getGps() {
        return gps;
    }

    public void setGps(GPS gps) {
        this.gps = gps;
    }

    public String print() {
        String info = "";
        info += "Count of seat: " + seats + "\n";
        info += "Enginee: volum - " + enginee.getVolume() + ";mileage - " + enginee.getMileage() + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: NA" + "\n";
        }
        if (this.gps != null) {
            info += "GPS Navigator: Funtional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}
