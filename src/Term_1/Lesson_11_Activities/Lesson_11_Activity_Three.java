package Term_1.Lesson_11_Activities;/*
 * Lesson 11 Coding Activity 3
 * Get two integers from the keyboard and test if they are equal.
 * If they are, print "YES" (without the quotes).
*/

import java.util.Scanner;


class Lesson_11_Activity_Three {   
public static void main(String[] args) 
   {
       Scanner s = new Scanner(System.in);
       int a = s.nextInt();
       int b = s.nextInt();
       if (a == b) {
           System.out.println("YES");
       }
    }
}