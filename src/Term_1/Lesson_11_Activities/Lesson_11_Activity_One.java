package Term_1.Lesson_11_Activities;/*
 * Lesson 11 Coding Activity 1
 * Test if an integer input from the keyboard is equal to the integer 176. 
 * If it is, print "YES" (without the quotes).
*/

import java.util.Scanner;


class Lesson_11_Activity_One {
   
      
      
public static void main(String[] args) 
   { 
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
       if (a == 176) {
           System.out.println("YES");
       }
    }
}