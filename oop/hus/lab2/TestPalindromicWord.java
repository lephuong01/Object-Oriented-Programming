package oop.hus.lab2;

import java.util.Scanner;

public class TestPalindromicWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap chuoi can kiem tra: ");
        String chain = in.next().toUpperCase();
        testPalindromicWord(chain);
    }

    public static void testPalindromicWord(String chain){
        for (int i = 0; i < chain.length(); i++){
            char character = chain.charAt(chain.length() - i - 1);
            if (chain.charAt(i) == character){
                System.out.printf("Chuoi \"%s\" la chuoi Palindromic", chain);
            } else {
                System.out.printf("Chuoi \"%s\" khong la chuoi Palindromic", chain);
            }
            break;
        }
    }
}
