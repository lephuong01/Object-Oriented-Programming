package oop.hus.lab11.bridge.uml;

public abstract class Computer {
    protected OperatingSystem os;

    public Computer(OperatingSystem os) {
        this.os = os;
    }

    public abstract void startUp();

    public abstract void browseInternet(String url);

    public abstract boolean canMoreComputer();
}
