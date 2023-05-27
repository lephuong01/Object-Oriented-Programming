package oop.hus.lab9.library;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        Rent longestRent = rents[0];
        for (Rent rent : rents) {
            if ((rent.getEnd().getTime() - rent.getBegin().getTime()) > (longestRent.getEnd().getTime() - longestRent.getBegin().getTime())) {
                longestRent = rent;
            }
        }
        return longestRent;
    }

}
