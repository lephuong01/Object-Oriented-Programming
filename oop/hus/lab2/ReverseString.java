package oop.hus.lab2;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = in.next();
        System.out.printf("The reverse of the String \"%s\" is \"%s\"", str, reverseString(str));
        in.close();
    }

    public static String reverseStringUsingLib(String inString) {
        StringBuilder reverseString = new StringBuilder();
        reverseString.append(inString);
        reverseString.reverse();
        return reverseString.toString();
    }

    public static String reverseString(String inString) {
        if (inString == null) {
            return null;
        }
        StringBuilder reverString = new StringBuilder();
        for (int i = inString.length() - 1; i >= 0; i--) {
            reverString.append(inString.charAt(i));
        }
        return reverString.toString();
    }
}
