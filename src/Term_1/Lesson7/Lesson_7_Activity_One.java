package Term_1.Lesson7;/*
 * Lesson 7 Coding Activity Question 1
 *
 * Input a positive three digit integer. Print out the digits one per line.
 *
 * Sample run:
 
Please enter a three digit number:
678

Here are the digits:
6
7
8

*/

import java.util.Scanner;

class Lesson_7_Activity_One {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a three digit number:");
        int a = s.nextInt();
        System.out.println("Here are the digits:\n" + (a / 100) + "\n" + (a - ((a / 100) * 100)) / 10 + "\n" + a % 10);


    }
}