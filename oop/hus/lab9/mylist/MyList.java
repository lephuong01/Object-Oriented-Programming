package oop.hus.lab9.mylist;

public interface MyList {
    void add(Object payload);

    void add(Object payload, int index);

    void remove(int index);

    Object get(int index);

    int size();
}
