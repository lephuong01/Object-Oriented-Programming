package oop.hus.lab11.bridge.uml;

public class WindownsOS implements OperatingSystem {
    @Override
    public void startUp() {
        System.out.println("WindownsOS start up");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Load " + url + " from Edge");
    }
}
