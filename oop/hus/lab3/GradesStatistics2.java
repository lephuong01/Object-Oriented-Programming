package oop.hus.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics2 {
    public static int[] grades;
    private static Scanner in = new Scanner(System.in);

    public static void readGrades() {
        System.out.print("Enter the number of students: ");
        int n = in.nextInt();
        grades = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = in.nextInt();
        }
        in.close();
    }

    public static void print(int[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        if (array.length > 0) {
            System.out.print(array[array.length - 1]);
        }
        System.out.println("]");
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    public static double median(int[] array) {
        int[] newArray = array.clone();
        Arrays.sort(newArray);
        int n = newArray.length;
        if (n % 2 == 0) {
            return (newArray[(n - 1) / 2] + newArray[n / 2]) / 2.0;
        }
        return newArray[n / 2];
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static double stdDev(int[] array) {
        double meanSquare = Math.pow(average(array), 2);
        double res = 0;
        for (int i : array) {
            res += i * i;
        }
        res = res / array.length - meanSquare;
        return Math.sqrt(res);
    }

    public static void main(String[] args) {
        readGrades();
        System.out.print("The grades are: ");
        print(grades);
        System.out.printf("The average is: %.2f\n", average(grades));
        System.out.printf("The median is: %.2f\n", median(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.printf("The standard deviation is: %.2f", stdDev(grades));
    }


}