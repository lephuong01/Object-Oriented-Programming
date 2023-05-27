package oop.hus.lab8.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Lists.insertFirst(list, 1);
        System.out.println(list);
        Lists.intsertLast(list, 2);
        Lists.intsertLast(list, 2);
        Lists.intsertLast(list, 666);
        System.out.println(list);
        Lists.replace(list, 3);
        System.out.println(list);
        Lists.removeThird(list);
        System.out.println("Remove third list: " + list);
        Lists.removeEvil(list);
        System.out.println("Remove Evil list: " + list);

        ArrayList<Integer> listSquare = Lists.generateSquare();
        System.out.println(listSquare);
        System.out.println(Lists.contains(list, 1));
        System.out.println(Lists.contains(list, 10));
        Lists.copy(list, listSquare);
        System.out.println("List Square list: " + listSquare);
        Lists.reverse(list);
        System.out.println("Reverse list: " + list);
        Lists.reverseManual(list);
        System.out.println("Reverse Manual list: " + list);

        LinkedList<Integer> linkedList = new LinkedList<>(list);
        Lists.insertBeginningEnd(linkedList, 0);
        System.out.println("Insert beginning list: " + linkedList);

    }
}
