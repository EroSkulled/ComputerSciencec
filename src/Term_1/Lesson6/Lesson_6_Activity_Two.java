package Term_1.Lesson6;/*
 * Lesson 6 Coding Activity Question 2
 *
 * Input a double value and print only the integer part.
 *
 * Sample run:
 
Please input a decimal number:
57.8934
Answer: 57

*/

import java.util.Scanner;

class Lesson_6_Activity_Two {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input a decimal number:");
        double a = s.nextDouble();
        System.out.println("Answer: " + (int) a);


    }
}