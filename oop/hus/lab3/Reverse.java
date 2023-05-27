package oop.hus.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of element of the array: ");
        int n = in.nextInt();
        System.out.print("Enter array: ");
        int[] array = new int[n];
        inputArray(array, in);
        reverse(array);
        printArray(array);
        in.close();
    }

    public static void inputArray(int[] array, Scanner in) {
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void reverse(int[] array) {
        if (array == null) {
            return;
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
