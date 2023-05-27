package oop.hus.lab11.visitor.exercise2;

public class Computer implements ComputerPart {
    private ComputerPart[] computerParts;

    public Computer(ComputerPart[] computerParts) {
        this.computerParts = computerParts;
    }

    public Computer() {
    }


    @Override
    public void accept(ComputerPartVisitor v) {
        for (ComputerPart computerPart : computerParts) {
            computerPart.accept(v);
        }
        v.visit(this);
    }
}
