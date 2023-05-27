package oop.hus.lab2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String str = in.next().toUpperCase();
        System.out.print("The plaintext string is: ");
        decipherCaesarCode(str);
        in.close();
    }

    public static void decipherCaesarCode(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ((char) str.charAt(i) >= 'D' && (char) str.charAt(i) <= 'Z') {
                System.out.print((char) (str.charAt(i) - 3));
            } else if (str.charAt(i) == 'A') {
                System.out.print('X');
            } else if (str.charAt(i) == 'B') {
                System.out.print('Y');
            } else if (str.charAt(i) == 'C') {
                System.out.print('Z');
            }
        }
    }
}
