package oop.hus.lab3;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = in.nextInt();
        System.out.print("Enter the value of all items: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.print("The value are: ");
        print(array);

    }

    public static void print(int[] array) {
        if (array == null) {
            System.out.print("Null");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        if (array.length > 0) {
            System.out.print(array[array.length - 1]);
        }
        System.out.print("]");
    }
}
