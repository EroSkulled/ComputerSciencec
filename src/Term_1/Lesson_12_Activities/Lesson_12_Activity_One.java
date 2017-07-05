package Term_1.Lesson_12_Activities;/*
 * Lesson 12 Coding Activity 1 
 * Write a program to input three integers. 
 * Test if the average is greater than or equal to 89.5. 
 * If so, print out the phrase "ABOVE AVERAGE" (without the quotes).
 */


import java.util.Scanner;

class Lesson_12_Activity_One {
    public static void main(String[] args)
     {
         Scanner s = new Scanner(System.in);
         int a = s.nextInt();
         int b = s.nextInt();
         int c = s.nextInt();
         double av = (a+b+c)/3.0;
         if (av >= 89.5) {
             System.out.println("ABOVE AVERAGE");
         }
    }
}