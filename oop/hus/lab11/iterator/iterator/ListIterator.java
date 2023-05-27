package oop.hus.lab11.iterator.iterator;

import java.util.List;

public class ListIterator implements MyIterator{
    private List<String> products;
    private int currentPosition;

    public ListIterator(List<String> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return this.currentPosition < products.size();
    }

    @Override
    public String next() {
        String currentProduct = this.products.get(this.currentPosition);
        this.currentPosition++;
        return currentProduct;
    }

    @Override
    public void remove() {
        this.products.remove(this.currentPosition);
    }
}
