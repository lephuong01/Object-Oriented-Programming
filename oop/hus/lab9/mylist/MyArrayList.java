package oop.hus.lab9.mylist;

public class MyArrayList extends MyAbstractList {
    private final static int DEFAULT_CAPACITY = 16;
    private Object[] elements;
    int size;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, this.size - 1);
        return this.elements[index];
    }


    @Override
    public void add(Object payload) {
        if (this.size == elements.length - 1) {
            enlarge();
        }
        this.elements[this.size] = payload;
        this.size++;
    }

    @Override
    public void add(Object payload, int index) {
//        if (size >= elements.length - 1) {
//            enlarge();
//        }
//        try {
//            checkBoundaries(index, size);
//            for (int i = size; i > index; i--) {
//                elements[i] = elements[i - 1];
//            }
//            elements[index] = payload;
//            size++;
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Can't add " + payload + " at index " + index);
//        }
        if (this.size == this.elements.length) {
            enlarge();
        }
        checkBoundaries(index, this.size);
        for (int i = this.size; i > index; i--) {
            this.elements[i] = this.elements[i - 1];
        }
        this.elements[index] = payload;
        this.size++;
    }


    public void remove(int index) {
//        try {
//            checkBoundaries(index, this.size - 1);
//            for (int i = index; i < size - 1; i++) {
//                elements[i] = elements[i + 1];
//            }
//            size--;
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Can't remove object at index " + index);
//        }

        checkBoundaries(index, this.size - 1);
        for (int i = index; i < (this.size - 1); i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.elements[this.size - 1] = null;
        this.size--;
    }


    private void enlarge() {
        Object[] newData = new Object[this.elements.length * 2];
        for (int i = 0; i < this.elements.length; i++) {
            newData[i] = this.elements[i];
        }
        //        System.arraycopy(elements, 0, newData, 0, elements.length);
        this.elements = newData;
    }
}
