package Term_1.Lesson_1011_Activity;/*
 * Lesson 1011 Coding Activity 
 * 
 * For this program you will input an int to represent the octal number 
 * and translate to the base ten number. The octal number must be 8 digits or less.
 * 
 * Your program should also check that all the digits are 0 - 7, then translate the 
 * number to base ten. 
 * 
 * Sample Run 1: 
 * Enter a number in base 8: 
 * 1287 
 * ERROR: Incorrect Octal Format 
 * 
 * Sample Run 2: 
 * Enter a number in base 8: 
 * 123 
 * 83 
 * 
 * Sample Run 3: 
 * Enter a number in base 8: 
 * 1111111111 
 * ERROR: Incorrect Octal Format
 *   
 */

import java.util.Scanner;

class Lesson_1011_Activity{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number in base 8:");
        Integer a = s.nextInt();
        if (a.toString().matches("[01234567]*") && a.toString().length() <= 8){
            String aa = a.toString();
            int result = 0;
            for (int i = a.toString().length() - 1; i >= 0; i--){
                result += Integer.parseInt(aa.substring(i, i + 1))*(Math.pow(8,aa.length() - i - 1));
            }
            System.out.println(result);
        } else {
            System.out.println("ERROR: Incorrect Octal Format");
        }
    }
}