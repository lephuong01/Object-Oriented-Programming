package oop.hus.lab10.strategy.pay;

public class CreditCardValidator {
    // return true if the card number is valid
    public static boolean isValid(long number) {
        return (getSize(number) >= 13
                && getSize(number) <= 16)
                && (prefixMatched(number, 4)
                || prefixMatched(number, 5)
                || prefixMatched(number, 37)
                || prefixMatched(number, 6))
                && ((sumOfDoubleEvenPlace(number)
                + sumOfOddPlace(number)) % 10 == 0);
    }


    public static boolean isValid(String number) {
        return isValid(Long.parseLong(number));
    }

    // Get the result from Step 2
    private static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
        }
        return sum;
    }

    // return this number if it is a single digits, otherwise,
    // return the sum of the two digits
    private static int getDigit(int number) {
        if (number < 9) {
            return number;
        }
        return number / 10 + number % 10;
    }

    // return sum of odd-place digits in number
    private static int sumOfOddPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(num.charAt(i) + "");
        }
        return sum;
    }


    // return true if the digits d is a prefix for number
    private static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    // return the number of digits in d
    private static int getSize(long d) {
        String num = d + "";
        return num.length();
    }

    // return the first k number of digits from number
    // if the number of digits in number is less than k, return number
    private static long getPrefix(long number, int k) {
        if (getSize(number) > k) {
            String num = number + "";
            return Long.parseLong(num.substring(0, k));
        }
        return number;
    }

}
