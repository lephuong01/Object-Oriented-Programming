package oop.hus.lab11.bridge.uml;

public class MacOS implements OperatingSystem {
    @Override
    public void startUp() {
        System.out.println("MacOS start up!");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Load " + url + " from Edge!");
    }
}
