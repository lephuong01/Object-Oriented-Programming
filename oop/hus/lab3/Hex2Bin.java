package oop.hus.lab3;

import java.util.Scanner;

public class Hex2Bin {
    private final String[] HEX_BIN = {
            "0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hexStr = in.next();

        Hex2Bin aHex2Bin = new Hex2Bin();
        if (!aHex2Bin.isHex(hexStr)) {
            System.out.printf("Invalid Hexadecimal string \"%1$s\"\n", hexStr);
            return;
        }
        aHex2Bin.convertHexToBin(hexStr);
        in.close();
    }

    private boolean isHex(String hexStr) {
        for (int i = 0; i < hexStr.length(); i++) {
            if (Character.digit(hexStr.toLowerCase().charAt(i), 16) < 0) {
                return false;
            }
        }
        return true;
    }

    private void convertHexToBin(String hexStr) {
        System.out.printf("The equivalent binary for hexadecimal \"%1$s\" is: ", hexStr);
        String hexLower = hexStr.toLowerCase();
        for (int i = 0; i < hexLower.length(); i++) {
            char c = hexLower.charAt(i);
            if (c > '0' && c < '9') {
                System.out.print(HEX_BIN[c - '0'] + " ");
            } else {
                System.out.print(HEX_BIN[c - 'a' + 10] + " ");
            }
        }
    }
}
