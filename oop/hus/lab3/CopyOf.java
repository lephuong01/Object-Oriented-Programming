package oop.hus.lab3;

import java.util.Scanner;

public class CopyOf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of element of the array: ");
        int n = in.nextInt();
        System.out.print("Enter the array: ");
        int[] array = inputArray(n, in);
        printArray(copyOf(array));
        System.out.println();
        System.out.print("Enter new length: ");
        int newLength = in.nextInt();
        printArray(copyOfUsingSecondParameter(array, newLength));
        in.close();
    }

    public static int[] inputArray(int n, Scanner in) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] copyOf(int[] array) {
        if (array == null) {
            return null;
        }
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }

    public static int[] copyOfUsingSecondParameter(int[] array, int newLength) {
        if (array == null) {
            return null;
        }
        int[] arr = new int[newLength];
        for (int i = 0; i < Math.min(array.length, newLength); i++) {
            arr[i] = array[i];
        }
        return arr;
    }
}
