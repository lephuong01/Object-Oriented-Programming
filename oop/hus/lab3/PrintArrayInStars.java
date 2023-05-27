package oop.hus.lab3;

import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = in.nextInt();
        System.out.print("Enter the value of all item (separated by space): ");
        int[] items = inputArray(NUM_ITEMS, in);
        printArrayInStars(items);
        in.close();
    }

    public static int[] inputArray(int n, Scanner in) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }

    public static void printArrayInStars(int[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.print(i + ": ");
            for (int starNo = 1; starNo <= items[i]; starNo++) {
                System.out.print("* ");
            }
            System.out.printf("(%d)", items[i]);
            System.out.println();
        }
    }
}
