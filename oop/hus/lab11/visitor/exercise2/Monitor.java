package oop.hus.lab11.visitor.exercise2;

public class Monitor implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }
}
