package Term_1.Lesson10;/*
 * Lesson 10 Coding Activity Question 1
 *
 * The following calculation will give roundoff error:
 *      double x = 1.473;
 *      System.out.println(2 - x);
 *
 * Write the code to correct it. You can assume no more than 3 decimal places will be used.
 *
 * Sample run:
 *
 *      Please enter two decimal values:
 *      2
 *      1.473
 *
 *      The difference is: 0.527
 *
 * Use this starter file as your template.
 *
*/

import java.util.Scanner;


class Lesson_10_Activity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter two decimal values:");
        double a = s.nextDouble();
        double b = s.nextDouble();

        double c = ((int) (a*10000)) - ((int) (b*10000));
        System.out.println("The difference is: " + ((double) (c/10000)));

    }

}