package Term_1.Lesson5;/*
 * Lesson 5 Coding Activity Question 1
 * 
 * Input two double values and print the difference between them. 
 * (The difference can be found by subtracting the second value from the first).
 *
*/

import java.util.Scanner;

class Lesson_5_Activity_One {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double x1 = s.nextDouble();
        double x2 = s.nextDouble();

        System.out.println(x2 - x1);


    }
}