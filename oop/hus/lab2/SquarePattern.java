package oop.hus.lab2;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();
        squarePatternUsingForLoops(size);
        System.out.println();
        squarePatternUsingWhile(size);
        in.close();
    }

    public static void squarePatternUsingForLoops(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void squarePatternUsingWhile(int size) {
        int row = 0;
        while (row < size) {
            int col = 0;
            while (col < size) {
                System.out.print("# ");
                ++col;
            }
            System.out.print(" ");
            ++row;
            System.out.println();
        }
    }
}
