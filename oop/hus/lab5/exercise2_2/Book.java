package oop.hus.lab5.exercise2_2;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" + "name=" + name + ",author=" + getAuthorNames() + ",price=" + price + ",qty=" + qty + ']';
    }

    public String getAuthorNames() {
        StringBuilder name = new StringBuilder();
        name.append("{").append(authors[0]);
        for (int i = 1; i < authors.length; i++) {
            name.append(",").append(authors[i]);
        }
        name.append("}");
        return name.toString();
    }
}
