package Term_1.Lesson_17_Activities;/*
 * Lesson 17 Coding Activity 1
 * Write a program that will input a list of test scores in from the keyboard. 
 * When the user enters -1, print the average.
 * 
 * What do you need to be careful about when using -1 to stop a loop?
 * 
 *     Sample Run:
 *         Enter the Scores:
 *         45
 *         100
 *         -1
 *
 *         The average is: 72.5
 * 
 * 
 */ 

import java.util.Scanner;

class Lesson_17_Activity_One {
    public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the Scores:");
         double n = 0;
         double t = 0;
         int l = 0;
         n = scan.nextInt();
         while (n != -1) {
             t += n;
             l++;
             n = scan.nextInt();
         }
         double r = t/l;
         System.out.println("The average is: " + r);

}
}