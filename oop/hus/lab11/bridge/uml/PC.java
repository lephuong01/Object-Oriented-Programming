package oop.hus.lab11.bridge.uml;

public class PC extends Computer {

    public PC(OperatingSystem os) {
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
        return false;
    }
}
