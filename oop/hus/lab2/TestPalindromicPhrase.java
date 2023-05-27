package oop.hus.lab2;

import java.util.Scanner;

public class TestPalindromicPhrase {

    public static void main(String[] args) {
        String inStr, strTest;
        String strNew = "";
        boolean palindromic = true;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        inStr = in.nextLine();
        strTest = inStr.toLowerCase();
        in.close();
        for (int charIdx = 0; charIdx < strTest.length(); charIdx++) {
            if (Character.isLetter(strTest.charAt(charIdx))) {
                strNew += Character.toString(strTest.charAt(charIdx));
            }
        }
        for (int fIdx = 0, bIdx = strNew.length() - 1; fIdx < bIdx; ++fIdx, --bIdx) {
            if (!(strNew.charAt(fIdx) == strNew.charAt(bIdx))) {
                palindromic = false;
            }
        }
        if (palindromic) {
            System.out.println("'" + inStr + "' is a palindrome");
        } else {
            System.out.println("'" + inStr + "' is not a palindrome");
        }
    }
}
