package oop.hus.lab11.visitor.exercise2;

public class Mouse implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }
}
