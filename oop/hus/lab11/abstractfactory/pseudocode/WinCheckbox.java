package oop.hus.lab11.abstractfactory.pseudocode;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Render a checkbox in Windows style");
    }
}
