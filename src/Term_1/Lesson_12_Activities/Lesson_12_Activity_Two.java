package Term_1.Lesson_12_Activities;/*
 * Lesson 12 Coding Activity 2 
 * Input two decimal numbers and print the largest.
 * If the numbers are equal, print one of them.
 *     
 *     Sample Run 1
 *        Please enter two numbers:
 *        45.7
 *        45.1
 *
 *        Largest is: 45.7 
 *         
 *      Sample Run 2
 *        Please enter two numbers:
 *        14
 *        14
 * 
 *        Largest is: 14.0          
 * 
 */


import java.util.Scanner;

class Lesson_12_Activity_Two {
    public static void main(String[] args)
     {
         Scanner s = new Scanner(System.in);
         double a = s.nextDouble();
         double b = s.nextDouble();
         if (a >= b) {
             System.out.println("Largest = " + a);
         } else {
             System.out.println("Largest = " + b);
         }
    }
}