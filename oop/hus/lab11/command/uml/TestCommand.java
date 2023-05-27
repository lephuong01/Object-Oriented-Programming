package oop.hus.lab11.command.uml;

public class TestCommand {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();

        Switch myswitch = new Switch();

        RestartCommand restartCommand1 = new RestartCommand(computer1);
        ShutDownCommand shutdownCommand1 = new ShutDownCommand(computer1);

        RestartCommand restartCommand2 = new RestartCommand(computer1);
        ShutDownCommand shutdownCommand2 = new ShutDownCommand(computer1);

        myswitch.storeAndExecute(restartCommand1);
        myswitch.storeAndExecute(restartCommand2);
        myswitch.storeAndExecute(shutdownCommand1);
        myswitch.storeAndExecute(shutdownCommand2);
        System.out.println();

        myswitch.executeAllCommands();
    }
}
