package Term_1.Lesson_22_Activities;/*
 * Lesson 22 Coding Activity 1
 * Write the code to take a String and print it with one letter per line.

  Sample run:

  Enter a string:
  bought
  b
  o
  u
  g
  h
  t
  
*/ 

import java.util.Scanner;

class Lesson_22_Activity_One {
    public static void main(String[] args)
     {
         Scanner s = new Scanner(System.in);
         char[] word = s.nextLine().toCharArray();
         for (int i = 0; i < word.length; i++) {
             System.out.println(word[i]);
         }
}
}