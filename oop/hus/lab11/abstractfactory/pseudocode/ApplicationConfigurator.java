package oop.hus.lab11.abstractfactory.pseudocode;

public class ApplicationConfigurator {
    public static void main(String[] args) throws Exception {

        String configOS = System.getProperty("os.name").toLowerCase();
        GUIFactory factory;

        if (configOS.contains("win")) {
            factory = new WinFactory();
        } else if (configOS.contains("mac")) {
            factory = new MacFactory();
        } else {
            throw new Exception("Error! UnKnown operating system.");
        }
        Application application = new Application(factory);
        application.createUI();
        application.paint();
    }
}
