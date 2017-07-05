package Term_1.Lesson_13_Activities;/*
 * Lesson 13 Coding Activity 5 
 * Create a program to let the user practice their multiplication tables.
 * Print two random integers between 1 and 12 each on a new line. 
 * Then, ask the user to input the multiplication of the two numbers. 
 * If they enter the correct product print "Correct!" otherwise print "Wrong".
 */


import java.util.Scanner;

class Lesson_13_Activity_Five {
    public static void main(String[] args) {
        int a = (int) (1 + Math.random() * 12);
        System.out.println(a);
        int b = (int) (1 + Math.random() * 12);
        System.out.println(b);
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        if (r == (a * b)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong");
        }
    }
}