package oop.hus.lab10.adapter.pseudocode;

public class TestDrive {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg(6);
        System.out.println(hole.fits(peg));

        SquarePeg squarePeg = new SquarePeg(6);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        System.out.println(hole.fits(squarePegAdapter));
    }
}
