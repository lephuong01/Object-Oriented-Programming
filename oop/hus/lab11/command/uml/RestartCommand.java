package oop.hus.lab11.command.uml;

public class RestartCommand implements Command {
    private Computer computer;

    public RestartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.restart();
    }
}
