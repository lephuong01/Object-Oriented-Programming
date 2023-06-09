package oop.hus.lab4;

import java.util.Scanner;

public class Fibnacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        System.out.printf("F(%d) = %d", n, fibonacci(n));
        in.close();
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
