package oop.hus.lab3;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of element of the array1: ");
        int numberArray1 = in.nextInt();
        System.out.print("Enter the number of element of the array2: ");
        int numberArray2 = in.nextInt();
        int[] array1 = inputArray(numberArray1, in);
        int[] array2 = inputArray(numberArray2, in);
        System.out.println(equals(array1, array2));
        in.close();
    }

    public static int[] inputArray(int n, Scanner in) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1 == null) {
            if (array2 == null) {
                return true;
            }
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
