package Term_2.Lesson_2_Activity;

import java.util.ArrayList;
import java.util.Scanner;

//replace the class name main into Main
class Lesson_2_Activity_One {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String temp = " ";
        ArrayList<String> array = new ArrayList();

        System.out.println("Please enter $$, enter STOP to stop the loop.");
        temp = s.nextLine();

        while (!temp.equals("STOP")){
            if (!(temp == " ")){
                array.add(temp);
            }


            temp = s.nextLine();
        }
        for(String word : array) {
            if (word.contains("a")){
                System.out.println(word);
            }
        }




    }
}