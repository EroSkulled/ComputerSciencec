package Term_1.Lesson_11_Activities;/*
 * Lesson 11 Coding Activity 4
 * Test if an integer input from the keyboard is odd or even.
 * 
 *     Sample Run 1:
 *        Enter a Number:
 *        78
 *        Even
 * 
 *     Sample Run 2:
 *        Enter a Number:
 *        17
 *        Odd
 * 
 */

import java.util.Scanner;


class Lesson_11_Activity_Four {   
public static void main(String[] args) 
   {
       System.out.println("Enter a Number:");
       Scanner s = new Scanner(System.in);
       int a = s.nextInt();
       if (a%2 == 0) {
           System.out.println("Even");
       } else {
           System.out.println("Odd");
       }
    }
}