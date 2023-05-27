package oop.hus.lab3;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of element for array: ");
        int n = in.nextInt();
        System.out.print("Enter array: ");
        int[] array = inputArray(n, in);
        System.out.print("Enter the key: ");
        int key = in.nextInt();
        System.out.println(search(array, key));
        in.close();
    }

    public static int[] inputArray(int n, Scanner in) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }

    public static int search(int[] array, int key) {
        if (array == null) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
