package oop.hus.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the element for array: ");
        int n = in.nextInt();
        System.out.println("Enter the array: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
        in.close();
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
//        for (int i = n - 1; i > 0; i--){
//            for (int j = 0; j < i; j++){
//                if (array[j] > array[j + 1]){
//                    int tmp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = tmp;
//                }
//            }
//        }
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = tmp;
                    swapped = true;
                }
            }
            n = n - 1;
        }
        while (swapped);
    }
}
