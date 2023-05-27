package oop.hus.lab11.bridge.uml;

public class Laptop extends Computer {

    public Laptop(OperatingSystem os) {
        super(os);
    }

    @Override
    public void startUp() {
        os.startUp();
    }

    @Override
    public void browseInternet(String url) {
        os.loadUrl(url);
    }

    @Override
    public boolean canMoreComputer() {
        return true;
    }
}
