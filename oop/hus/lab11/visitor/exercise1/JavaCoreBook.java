package oop.hus.lab11.visitor.exercise1;

public class JavaCoreBook implements ProgramingBook {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "http://github.com";
    }

    public String getFavouriteBook() {
        return "The most favourite book of java core.";
    }
}
