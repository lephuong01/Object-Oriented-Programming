package oop.hus.lab2;

import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String str = in.next().toUpperCase();
        System.out.print("The ciphertext string is: ");
        getExchangeCipher(str);
        in.close();
    }

    public static void getExchangeCipher(String plainTextChar) {
        for (int i = 0; i < plainTextChar.length(); i++) {
            char cipherTextChar = (char) ('A' + 'Z' - plainTextChar.charAt(i));
            System.out.print(cipherTextChar);
        }
    }
}
