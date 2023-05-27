package oop.hus.lab4;

import java.util.Scanner;
public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = in.nextInt();
        printPerfectList(upperBound);
        printDeficientList(upperBound);
        in.close();
    }

    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return sum == aPosInt;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum < aPosInt) {
            return true;
        }
        return false;
    }

    public static void printPerfectList(int n) {
        System.out.println("These numbers are perfect: ");
        int count = 0;
        for (int i = 6; i <= n; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.printf("\n[%d perfect numbers found (%.2f%%)]\n\n", count, (double) count / n * 100);
    }

    public static void printDeficientList(int n) {
        System.out.println("These number are neither deficient nor perfect: ");
        int count2 = 0;
        for (int i = 1; i <= n; i++) {
            if (!isDeficient(i)) {
                System.out.print(i + " ");
                count2++;
            }
        }
        System.out.printf("\n[%d numbers found (%.2f%%)]", count2, (double) count2 / n * 100);
    }
}
