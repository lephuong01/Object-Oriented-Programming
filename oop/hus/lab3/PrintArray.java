package oop.hus.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        int[] items;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = in.nextInt();
        items = new int[NUM_ITEMS];
        printArray(inputArr(NUM_ITEMS, in));
        in.close();

    }

    public static int[] inputArr(int n, Scanner in) {
        int[] arr = new int[n];
        System.out.print("Enter the value of all items: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        return arr;

    }

    public static void printArray(int[] items) {
        System.out.print("The values are: ");
        for (int i = 0; i < items.length; i++) {
            if (i == 0) {
                System.out.print("[" + items[i] + ", ");
            } else if (i == items.length - 1) {
                System.out.print(items[i] + "]");
            } else {
                System.out.print(items[i] + ", ");
            }
        }
    }
}
