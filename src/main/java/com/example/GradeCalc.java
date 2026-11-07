
package com.example;

public class GradeCalc {

    public static int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    public static double calculateAverage(int m1, int m2, int m3) {
        return calculateTotal(m1, m2, m3) / 3.0;
    }

    public static String calculateGrade(double average) {

        if (average > 90) {
            return "A";
        }
        else if (average > 80) {
            return "B";
        }
        else if (average > 70) {
            return "C";
        }
        else {
            return "D";
        }
    }

    public static void main(String[] args) {

        int m1 = 95, m2 = 92, m3 = 98;

        int total = calculateTotal(m1, m2, m3);
        double average = calculateAverage(m1, m2, m3);

        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade   : " + calculateGrade(average));
    }
}
