package oop.hus.lab2;

import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = in.nextInt();
        System.out.print("Enter the String: ");
        String radixString = in.next().toLowerCase();
        for (int i = 0; i < radixString.length(); i++){
            if(!isRadixDigits(radixString.charAt(i))){
                System.out.printf("error: invalid %d String \"%s\"");
                return;
            }
        }
        System.out.printf("The equivalent decimal number for %d \"%s\" is %d", radix, radixString, radixToDecimal(radixString, radix));
    }

    public static int radixDigits(char lowerRadixChar){
        final String ch = "0123456789abcdef";
        return ch.indexOf(lowerRadixChar);
    }

    public static boolean isRadixDigits(char lowerRadixChar){
        final String ch = "0123456789abcdef";
        if (ch.indexOf(lowerRadixChar) == -1){
            return false;
        }
        return true;
    }

    public static int radixToDecimal(String radixNumber, int radix){
        int decimalNumber = 0;
        int maxIdx = radixNumber.length();
        for (int i = 0; i < maxIdx; i++){
            decimalNumber = decimalNumber * radix + radixDigits(radixNumber.charAt(i));
        }
        return decimalNumber;
    }


}
