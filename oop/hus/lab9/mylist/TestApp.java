package oop.hus.lab9.mylist;

public class TestApp {
    public static void main(String[] args) {
        testArrayList();
        testLinkList();
    }

    public static void testLinkList() {
        MyList linkList = new MyLinkedList();
        linkList.add("a", 0);
        linkList.add("b");
        linkList.add("c", 0);
        linkList.add("c", 3);
        System.out.println(linkList.size());
        System.out.println(linkList);

    }


    public static void testArrayList() {
        MyList arrayList = new MyArrayList();
        arrayList.add("a", 0);
        arrayList.add("b");
        arrayList.add("c", 0);
        arrayList.add("c", 3);
        arrayList.remove(3);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
    }

}
