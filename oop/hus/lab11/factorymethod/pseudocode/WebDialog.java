package oop.hus.lab11.factorymethod.pseudocode;

public class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
