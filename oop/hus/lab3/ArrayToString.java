package oop.hus.lab3;

import java.util.Scanner;

public class ArrayToString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = in.nextInt();
        System.out.print("Enter the array: ");
        int[] array = inputArray(n, in);
        System.out.print("The value are: ");
        System.out.println(arrayToString(array));
        in.close();
    }

    public static int[] inputArray(int n, Scanner in) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }

    public static String arrayToString(int[] array) {
        if (array == null) {
            return "null";
        }
        String str = "[";
        for (int i = 0; i < array.length - 1; i++) {
            str += array[i] + ",";
        }
        str += array[array.length - 1] + "]";
        return str;
    }
}
