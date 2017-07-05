package Term_1.Lesson_22_Activities;/*
 * Lesson 22 Coding Activity 2
 * Write the code to take a String and print it diagonally.

  Sample run:

  Enter a string:
  bought
  b
      o
          u
              g
                  h
                      t
  Use a tab character for every four spaces in the sample.

  Hint: You may need more than one loop.
  
*/ 

import java.util.Scanner;

class Lesson_22_Activity_Two {
    public static void main(String[] args)
     {
         Scanner s = new Scanner(System.in);
         String LOL = "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
         char[] word = s.nextLine().toCharArray();
         for (int i = 0; i < word.length; i++) {
             System.out.println(LOL.substring(0,i) + word[i]);
         }
}
}