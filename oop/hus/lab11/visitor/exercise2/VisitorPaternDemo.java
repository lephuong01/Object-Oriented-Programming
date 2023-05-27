package oop.hus.lab11.visitor.exercise2;

public class VisitorPaternDemo {
    public static void main(String[] args) {
        ComputerPart[] computerParts = new ComputerPart[]{new Monitor(), new Mouse(), new Keyboard()};
        Computer computer = new Computer(computerParts);
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
