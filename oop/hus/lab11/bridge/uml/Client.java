package oop.hus.lab11.bridge.uml;

public class Client {
    public static void main(String[] args) {
        WindownsOS windownsOS = new WindownsOS();
        Computer computer = new Laptop(windownsOS);
        computer.startUp();
        computer.browseInternet("http://youtube.com");

        Computer computer1 = new PC(new MacOS());
        computer1.startUp();
        computer1.browseInternet("http://facebook.com");
        if (computer.canMoreComputer()) {
            System.out.println("Move to another place");
        }
    }
}
