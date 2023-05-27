package oop.hus.lab4;

import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = in.nextInt();
        System.out.println("These number are equal to the product of prime factors:");
        printPerfectPrimeFactorList(upperBound);
        in.close();
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int product = 1;
        for (int i = 2; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0 && PrimeList.isPrime(i)) {
                product *= i;
            }
        }
        return product == aPosInt;
    }

    public static void printPerfectPrimeFactorList(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.printf("\n[%d numbers found (%.2f%%)]", count, (1.0 * count / n) * 100);
    }
}
