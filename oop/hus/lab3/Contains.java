package oop.hus.lab3;

import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = in.nextInt();
        System.out.print("Enter array: ");
        int[] array = inputArray(n, in);
        System.out.print("Enter a key: ");
        int key = in.nextInt();
        System.out.println(contains(array, key));
        in.close();
    }

    public static int[] inputArray(int n, Scanner in) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }

    public static boolean contains(int[] array, int key) {
        if (array == null) {
            return false;
        }
        for (int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }
}
