package oop.hus.lab11.iterator.iterator;

import java.util.LinkedList;
import java.util.List;

public class ListProductCatalog implements ProductCatalog {
    private List<String> products;

    public ListProductCatalog() {
        this.products = new LinkedList<>();
    }


    @Override
    public void add(String product) {
        this.products.add(product);
    }

    @Override
    public void remove(int index) {
        this.products.remove(index);
    }

    @Override
    public MyIterator iterator() {
        return new ListIterator(this.products);
    }
}
