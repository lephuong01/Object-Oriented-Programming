package oop.hus.lab1.exercise2;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average = 0;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number;
        }
        average = 1.0 * sum / 100;
        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The average is " + average);
    }
}
