package oop.hus.lab2;

import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hex = in.next();

        for (int i = 0; i < hex.length(); i++) {
            if (!isHexDigit(hex.charAt(i))) {
                System.out.printf("error: invalid hexadecimal string \"%s\"", hex);
                return;
            }
        }
        System.out.printf("The equivalent decimal number for hexadecimal \"%s\" is %s", hex, hexToDecimal(hex));
    }

    public static int hexToDecimal(String hexNumber) {
        int decimalNumber = 0;
        int maxIndex = hexNumber.length();
        for (int i = 0; i < maxIndex; i++) {
            decimalNumber += hexDigit(hexNumber.charAt(i)) * ((int) Math.pow(16, maxIndex - 1 - i));
        }
        return decimalNumber;
    }

    public static int hexDigit(char lowerHexChar) {
        final String HEX_DIGITS = "0123456789abcdef";
        return HEX_DIGITS.indexOf(lowerHexChar);
    }

    public static boolean isHexDigit(char lowerHexChar) {
        final String HEX_DIGITS = "0123456789abcdef";
        if (HEX_DIGITS.indexOf(lowerHexChar) == -1) {
            return false;
        }
        return true;
    }

    public static int hexToDeccimalUsingIterativeAlgorithor(String hexNumber) {
        int decimalNumber = 0;
        double xPower = 1;
        int maxIndex = hexNumber.length();
        for (int i = maxIndex - 1; i >= 0; i--) {
            decimalNumber += hexDigit(hexNumber.charAt(i)) * ((int) xPower);
            xPower *= 16;
        }
        return decimalNumber;
    }

    public static int hexToDecimalUsingHornerAlgorithm(String hexString) {
        int decimalNumber = 0;
        for (int i = 0; i < hexString.length(); i++) {
            decimalNumber = decimalNumber * 16 + hexDigit(hexString.charAt(i));
        }
        return decimalNumber;
    }
}
