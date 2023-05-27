package oop.hus.lab3;

import java.util.Scanner;

public class Dec2Hex {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a decimal number: ");
        if (in.hasNextInt()) {
            int decimal = in.nextInt();
            System.out.printf("The equivalent hexadecimal number is %s", convertDecToHex(decimal));
        } else {
            System.out.printf("error: invalid decimal int");
        }
        in.close();
    }

    public static String convertDecToHex(int decimal) {
        String hex = "";
        while (decimal != 0) {
            int hexValue = decimal % 16;

            char hexDigit = (0 <= hexValue && hexValue <= 9) ?
                    (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');

            hex = hexDigit + hex;
            decimal = decimal / 16;
        }
        return hex;
    }
}