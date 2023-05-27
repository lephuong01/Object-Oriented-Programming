package oop.hus.lab11.iterator.iterator;

public class IteratorTestDrive {
    public static void main(String[] args) {
        ProductCatalog listProduct = new ListProductCatalog();
        listProduct.add("Apple");
        listProduct.add("Banana");
        listProduct.add("Orange");
        listProduct.add("Lemon");
        listProduct.add("Grape");

        MyIterator iterator = listProduct.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
