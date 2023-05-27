package oop.hus.lab11.visitor.exercise1;

public class BusinessBook implements Book {

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getPublisher() {
        return "The publisher of bussiness book";
    }
}
