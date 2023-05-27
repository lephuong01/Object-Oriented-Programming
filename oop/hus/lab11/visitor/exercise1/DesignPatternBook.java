package oop.hus.lab11.visitor.exercise1;

public class DesignPatternBook implements ProgramingBook {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "http://github.com";
    }

    public String getBestSeller() {
        return "The best seller of design patter book";
    }
}
