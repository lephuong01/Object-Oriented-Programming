package oop.hus.lab11.factorymethod.structure;

public abstract class Creator {
    public abstract Product createProduct();

    public void someOperation() {
        Product product = createProduct();
        product.doStuff();
    }
}
