package oop.hus.lab2;

import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = in.next();
        String testVowels = str.toLowerCase();

        int countVowels = countVowels(testVowels);
        double ratioVowel = Math.round((1.0 * countVowels * 100 / str.length()) * 100.0) / 100.0;

        int countDigits = countDigits(testVowels);
        double ratioDigits = Math.round((1.0 * countDigits * 100 / str.length()) * 100.0) / 100.0;

        System.out.printf("Number of vowels: %d (%.2f %%)", countVowels, ratioVowel);
        System.out.println();
        System.out.printf("Number of digits: %1d (%.2f %%)", countDigits, ratioDigits);
        in.close();
    }

    public static int countDigitsUsingLib(String inString) {
        int count = 0;
        for (int i = 0; i < inString.length(); i++) {
            if (Character.isDigit(inString.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countDigits(String inString) {
        int count = 0;
        for (int i = 0; i < inString.length(); i++) {
            char ch = inString.charAt(i);
            if ((ch >= '0') && (ch <= '9')) {
                count++;
            }
        }
        return count;
    }

    public static int countVowels(String inString) {
        int count = 0;
        for (int i = 0; i < inString.length(); i++) {
            char ch = inString.charAt(i);
            if (isVowel(ch)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char lowerChar) {
        switch (lowerChar) {
            case 'a':
            case 'o':
            case 'i':
            case 'e':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    public static boolean isVowelUsingString(char lowerChar) {
        final String LOWER_VOWELS = "oieua";
        if (LOWER_VOWELS.indexOf(lowerChar) == -1) {
            return false;
        }
        return true;
    }
}
