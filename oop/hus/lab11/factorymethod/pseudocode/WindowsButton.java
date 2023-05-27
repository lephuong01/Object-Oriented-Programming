package oop.hus.lab11.factorymethod.pseudocode;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Render a button in Windows style");
    }

    @Override
    public void onClick() {
        System.out.println("Bind a native OS click even");
    }
}
