package oop.hus.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        System.out.println("Enter array: ");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        insertionSort(array);
        System.out.println(Arrays.toString(array));
        in.close();
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                int tmp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = tmp;
                j = j - 1;
            }
        }
    }
}
