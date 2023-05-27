package oop.hus.lab3;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the flag: ");
        int flag = in.nextInt();
        System.out.print("Magic sum is: " + getMagicSum(flag, in));
        in.close();
    }

    public static int getMagicSum(int flag, Scanner in) {
        int magicSum = 0;
        System.out.print("Enter -1 to end: ");
        int number = in.nextInt();
        while (number != flag) {
            if (hasEight(number)) {
                magicSum += number;
            }
            System.out.print("Enter -1 to end: ");
            number = in.nextInt();
        }
        return magicSum;
    }

    public static boolean hasEight(int number) {
        String stringNumber = Integer.toString(number);
        for (int i = 0; i < stringNumber.length(); i++) {
            if (stringNumber.charAt(i) == '8') {
                return true;
            }
        }
        return false;
    }
}
