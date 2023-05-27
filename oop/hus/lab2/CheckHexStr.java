package oop.hus.lab2;

import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String hex = in.next();
        String hex2 = hex.toLowerCase();

        if (isHexString(hex2)) {
            System.out.printf("\"%s\" is a hex string", hex);
        } else {
            System.out.printf("\"%s\" is NOT a hex string", hex);
        }
        in.close();
    }

    public static boolean isHexString(String hexString) {
        for (int i = 0; i < hexString.length(); i++) {
            char ch = hexString.charAt(i);
            if (!isHexChar(ch)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isHexChar(char lowerChar) {
        final String HEX_DIGITS = "012345678abcdef";
        if (HEX_DIGITS.indexOf(lowerChar) == -1) {
            return false;
        }
        return true;
    }
}
