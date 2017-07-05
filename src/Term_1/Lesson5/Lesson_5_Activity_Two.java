package Term_1.Lesson5;/*
 * Lesson 5 Coding Activity Question 2
 * 
 * Input four integer values and print the sum of all four values.
 *
*/

import java.util.Scanner;

class Lesson_5_Activity_Two {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double x1 = s.nextInt();
        double x2 = s.nextInt();
        double x3 = s.nextInt();
        double x4 = s.nextInt();

        System.out.println(x1 + x2 + x3 + x4);

    }
}