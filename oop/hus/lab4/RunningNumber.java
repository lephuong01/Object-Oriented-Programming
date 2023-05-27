package oop.hus.lab4;

import java.util.Scanner;

public class RunningNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        System.out.printf("S(%d) = %s \n", n, runningNumber(n));
        System.out.printf("length is " + len(n));
        in.close();
    }

    public static String runningNumber(int n) {
        if (n == 1) {
            return "1";
        }
        return runningNumber(n - 1) + n;
    }

    public static int len(int n) {
        if (n == 1) {
            return 1;
        }
        return len(n - 1) + (n + "").length();
    }
}
