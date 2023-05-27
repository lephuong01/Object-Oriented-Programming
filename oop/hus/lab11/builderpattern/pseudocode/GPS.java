package oop.hus.lab11.builderpattern.pseudocode;

public class GPS {
    private String route;

    public GPS() {
        this.route = "221b, Barker Street, London to Scotland Yard 8-10 Broadway, London";
    }

    public GPS(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }
}
