package Term_1.Lesson_13_Activities;/*
 * Lesson 13 Coding Activity 2 
 * Take input of an integer number from the keyboard and print "passing" 
 * if it's greater than or equal to 60, and print "failing" otherwise.
 */


import java.util.Scanner;

class Lesson_13_Activity_Two {
    public static void main(String[] args)
     {
         Scanner s = new Scanner(System.in);
         int a = s.nextInt();
         if (a >= 60) {
             System.out.println("passing");
         } else {
             System.out.println("failing");
         }
    }
}