package oop.hus.lab11.iterator.iterator;

public interface ProductCatalog extends MyIterable {
    void add(String item);

    void remove(int index);
}
