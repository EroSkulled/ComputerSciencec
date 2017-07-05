package Term_1.Lesson7;/*
 * Lesson 7 Coding Activity Question 2
 *
 * Change the last problem so that it also prints the sum of the digits. 
 * Use the format shown below.
 *
 * Make sure your output is printed in the same order as the sample run.
 *
 * Sample run:
 
Please enter a three digit number:
678

Here are the digits:
6
7
8

6 + 7 + 8 = 21

*/

import java.util.Scanner;

class Lesson_7_Activity_Two {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a three digit number:");
        int a = s.nextInt();
        System.out.println("Here are the digits:\n" + (a / 100) + "\n" + (a - ((a / 100) * 100)) / 10 + "\n" + a % 10);
        System.out.println((a / 100) + " + " + (a - ((a / 100) * 100)) / 10 + " + " + a % 10 + " = " + (((a - ((a / 100) * 100)) / 10) + (a / 100) + a % 10));


    }
}