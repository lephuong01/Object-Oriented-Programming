package oop.hus.lab11.iterator.iterator;


public class ArrayProductCatalog implements ProductCatalog {

    private String[] products;
    private int length;

    public ArrayProductCatalog() {
        this.products = new String[100];
        this.length = 0;
    }

    @Override
    public void add(String product) {
        this.products[length] = product;
        this.length++;
    }

    @Override
    public void remove(int index) {
        if (index == this.length - 1) {
            this.products[index] = null;
            this.length--;
            return;
        }
        for (int i = index; i < length - 1; i++) {
            this.products[i] = this.products[i + 1];

        }
        this.products[this.length - 1] = null;
        this.length--;
    }

    @Override
    public MyIterator iterator() {

        return new ArrayIterator(this.products, this.length);
    }
}
