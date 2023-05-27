package oop.hus.lab10.adapter.pseudocode;

public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg peg) {
        return (this.radius >= peg.getRadius()) ? true : false;
    }
}
