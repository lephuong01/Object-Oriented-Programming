package oop.hus.lab2;

import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Octal string: ");
        String oct = in.next();
        for (int i = 0; i < oct.length(); i++) {
            if (!isOctDigits(oct.charAt(i))) {
                System.out.printf("error: invalid octal string \"%s\"", oct);
                return;
            }
        }
        System.out.printf("The equivalent decimal number \"%s\" is: %s", oct, oct2Dec(oct));
        in.close();
    }

    public static int octDigits(char lowerOctChar) {
        final String OCT_NUM = "01234567";
        return OCT_NUM.indexOf(lowerOctChar);
    }

    public static boolean isOctDigits(char lowerOctChar) {
        final String OCT_NUM = "01234567";
        if (OCT_NUM.indexOf(lowerOctChar) == -1) {
            return false;
        }
        return true;
    }

    public static int oct2Dec(String octString) {
        int decimalNumber = 0;
        double xPow = 1;
        int maxIndex = octString.length();
        for (int i = maxIndex - 1; i >= 0; i--) {
            decimalNumber += octDigits(octString.charAt(i)) * ((int) xPow);
            xPow *= 8;
        }
        return decimalNumber;
    }
}
