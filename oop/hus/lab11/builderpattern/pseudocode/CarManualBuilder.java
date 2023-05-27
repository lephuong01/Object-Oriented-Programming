package oop.hus.lab11.builderpattern.pseudocode;

public class CarManualBuilder implements Builder {

    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public Builder reset() {
        manual = new Manual();
        return this;
    }

    @Override
    public Builder setSeats(int number) {
        manual.setSeats(number);
        return this;
    }

    @Override
    public Builder setEnginee(Enginee enginee) {
        manual.setEnginee(enginee);
        return this;
    }

    @Override
    public Builder setTripComputer(TripComputer tripComputer) {
        manual.setTripComputer(tripComputer);
        return this;
    }

    @Override
    public Builder setGPS(GPS gps) {
        manual.setGps(gps);
        return this;
    }

    public Manual getProduct() {
        Manual product = manual;
        reset();
        return product;
    }
}
