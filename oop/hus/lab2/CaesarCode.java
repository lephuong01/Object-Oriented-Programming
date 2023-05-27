package oop.hus.lab2;

import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String str = in.next().toUpperCase();
        System.out.print("The ciphertext string is: ");
        carsarCode(str);
        in.close();
    }

    public static void carsarCode(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'W') {
                System.out.print((char) (str.charAt(i) + 3));

            } else if (str.charAt(i) == 'X') {
                System.out.print('A');
            } else if (str.charAt(i) == 'Y') {
                System.out.print('B');
            } else if (str.charAt(i) == 'Z') {
                System.out.print('C');
            }
        }
    }
}
