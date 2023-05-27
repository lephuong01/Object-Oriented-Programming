package oop.hus.lab2;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String bin = in.next().toLowerCase();

        for (int i = 0; i < bin.length(); i++) {
            if (!isBinDigits(bin.charAt(i))) {
                System.out.printf("error: invalid binary string \"%s\"", bin.toLowerCase());
                return;
            }
        }
        System.out.printf("The equivalent decimal number for binary \"%s\" is: %s", bin, bin2Dec(bin));
        in.close();
    }

    public static int binDigits(char lowerBinChar) {
        final String BIN_NUM = "01";
        return BIN_NUM.indexOf(lowerBinChar);
    }

    public static boolean isBinDigits(char lowerBinChar) {
        final String BIN_NUM = "01";
        if (BIN_NUM.indexOf(lowerBinChar) == -1) {
            return false;
        }
        return true;
    }

    public static int bin2Dec(String binString) {
        int decimalNum = 0;
        for (int i = 0; i < binString.length(); i++) {
            decimalNum = decimalNum * 2 + binDigits(binString.charAt(i));
        }
        return decimalNum;
    }


}
