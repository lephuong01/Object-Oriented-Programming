package oop.hus.lab3;

import java.util.Scanner;

public class GradesStatistics {
    private final int GRADE_MINIMUM = 0;
    private final int GRADE_MAXIMUM = 100;
    private int[] grades;

    public static void main(String[] args) {
        GradesStatistics gradesStatistics = new GradesStatistics();
        gradesStatistics.readGrades();
        System.out.printf("The average is: %1$.2f\n", gradesStatistics.averageGrade());
        System.out.printf("The min is: %1$d\n", gradesStatistics.minGrade());
        System.out.printf("The max is: %1$d\n", gradesStatistics.maxGrade());

    }

    private void readGrades() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberStudent = in.nextInt();
        grades = new int[numberStudent];
        int i = 0;
        while (i < numberStudent) {
            System.out.printf("Enter the grade for student %1$d: ", (i + 1));
            int grade = in.nextInt();
            if (GRADE_MAXIMUM >= grade && GRADE_MINIMUM <= grade) {
                grades[i] = grade;
                i++;
            } else {
                System.out.println("Error! numberStudent must be integer between 0 and 100");
            }
        }
        in.close();
    }

    private int minGrade() {
        if (grades == null || grades.length == 0) {
            System.out.print("There are no student in class");
            return -1;
        }
        int min = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }

    private int maxGrade() {
        if (grades == null || grades.length == 0) {
            System.out.print("There are no students in class");
            return -1;
        }
        int max = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }

    private double averageGrade() {
        int sum = 0;
        if (grades == null || grades.length == 0) {
            return 0.0;
        }
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return 1.0 * sum / grades.length;
    }

}
