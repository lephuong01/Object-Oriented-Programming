package oop.hus.lab2;

import java.util.Scanner;

public class HillPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int numRows = in.nextInt();
        hillPatternA(numRows);
        System.out.println();
        hillPatternB(numRows);
        System.out.println();
        hillPatternC(numRows);
        System.out.println();
        hillPatternD(numRows);
    }

    public static void hillPatternA(int numRows){
        for (int row = 1; row <= numRows; row++){
            for (int col = 1; col <= 2 * numRows - 1; col++){
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1)){
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hillPatternB(int numRows){
        for (int row = numRows; row >= 1; row--){
            for (int col = 1; col <= 2 * numRows - 1; col++){
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1)){
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hillPatternC(int numRows){
        hillPatternA(numRows);
        for (int row = numRows; row >= 1; row--){
            for (int col = 1; col <= 2 * numRows - 1; col++){
                if ((row + col > numRows + 1) && (row > col - numRows + 1)){
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hillPatternD(int numRows){
        for (int row = 1; row < numRows; row++){
            for (int col = 1; col <= 2 * numRows - 1; col++){
                if ((row + col > numRows + 1) && (row > col - numRows + 1)){
                    System.out.print("  ");
                }
                else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        for (int row = numRows; row >= 1; row--){
            for (int col = 1; col <= 2 * numRows - 1; col++){
                if ((row + col > numRows + 1) && (row > col - numRows + 1)){
                    System.out.print("  ");
                }
                else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

    }
}
