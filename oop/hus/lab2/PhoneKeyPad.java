package oop.hus.lab2;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String inChar = in.next().toLowerCase();
        phoneKeyPadUsingIf(inChar);
        System.out.println();
        phoneKeyPadUsingSwitchCase(inChar);
        in.close();
    }

    public static void phoneKeyPadUsingIf(String inStr) {
        for (int i = 0; i < inStr.length(); i++) {
            char ch = inStr.charAt(i);
            if (ch == 'a' || ch == 'b' || ch == 'c') {
                System.out.print(2);

            } else if (ch == 'd' || ch == 'e' || ch == 'f') {
                System.out.print(3);
            } else if (ch == 'g' || ch == 'h' || ch == 'i') {
                System.out.print(4);
            } else if (ch == 'j' || ch == 'k' || ch == 'l') {
                System.out.print(5);
            } else if (ch == 'm' || ch == 'n' || ch == 'o') {
                System.out.print(6);
            } else if (ch == 'p' || ch == 'q' || ch == 'r' || ch == 's') {
                System.out.print(7);
            } else if (ch == 't' || ch == 'u' || ch == 'v') {
                System.out.print(8);
            } else if (ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z') {
                System.out.print(9);
            } else {
                System.out.print(ch);
            }
        }

    }

    public static void phoneKeyPadUsingSwitchCase(String inStr) {
        for (int i = 0; i < inStr.length(); i++) {
            switch (inStr.charAt(i)) {
                case 'a':
                case 'b':
                case 'c':
                    System.out.print(2);
                    break;
                case 'd':
                case 'e':
                case 'f':
                    System.out.print(3);
                    break;
                case 'g':
                case 'h':
                case 'i':
                    System.out.print(4);
                    break;
                case 'j':
                case 'k':
                case 'l':
                    System.out.print(5);
                    break;
                case 'm':
                case 'n':
                case 'o':
                    System.out.print(6);
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    System.out.print(7);
                    break;
                case 't':
                case 'u':
                case 'v':
                    System.out.print(8);
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    System.out.print(9);
                    break;
                default:
                    System.out.print(inStr.charAt(i));
            }
        }
    }
}
