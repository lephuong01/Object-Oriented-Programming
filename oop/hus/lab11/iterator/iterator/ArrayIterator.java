package oop.hus.lab11.iterator.iterator;

public class ArrayIterator implements MyIterator {
    private String[] product;
    public int length;
    private int currentPosition;

    public ArrayIterator(String[] product, int length) {
        this.product = product;
        this.length = length;
    }

    @Override
    public boolean hasNext() {
        return (this.currentPosition < this.length);
    }

    @Override
    public String next() {
        String currentProduct = this.product[this.currentPosition];
        this.currentPosition++;
        return currentProduct;
    }

    @Override
    public void remove() {
        System.out.println("Unsupport!");
    }
}
