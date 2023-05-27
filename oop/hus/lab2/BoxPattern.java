package oop.hus.lab2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class BoxPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();
        boxPatternA(size);
        System.out.println();
        boxPatternB(size);
        System.out.println();
        boxPatternC(size);
        System.out.println();
        boxPatternD(size);
    }

    public static void boxPatternA(int size){
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row == 1 || row == size || col == 1 || col == size){
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternB(int size){
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row == 1 || row == size || row == col){
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternC(int size){
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row == 1 || row == size || row + col == size + 1){
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternD(int size){
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (size %2 != 0) {

                    if (row == 1 || row == size || row + col == size + 1 || row == col) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
                else {
                    size = size - 1;
                    if (row == 1 || row == size || row + col == size + 1 || row == col){
                        System.out.print("# ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }

            }
            System.out.println();
        }
    }
}
