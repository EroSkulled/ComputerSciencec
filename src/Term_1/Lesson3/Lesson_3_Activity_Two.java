package Term_1.Lesson3;/*
 * Lesson 3 Coding Activity Question 2
 * 
 * Write a program that asks the user for three names, then prints the names in reverse order.
 * 
 * Sample Run:

Please enter three names:
Zoey 
Zeb 
Zena 

Zena Zeb Zoey

*/

import java.util.Scanner;

class Lesson_3_Activity_Two {
    public static void main(String[] args) {

        System.out.println("Please enter three names:");
        Scanner scan = new Scanner(System.in);
        String n1 = scan.nextLine() + " ";
        String n2 = scan.nextLine() + " ";
        String n3 = scan.nextLine() + " ";

        System.out.println(n3 + n2 + n1);

    }
}