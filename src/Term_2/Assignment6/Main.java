import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Akatsuki on 3/24/17.
 */
public class Main {
    public static String word;
    public static ArrayList<String> words;

    public static void main(String[] var0) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the next name:");
        word = s.nextLine().toLowerCase();
        words= new ArrayList<String>();
        while (!word.equals("end")) {
            words.add(word);
            sort();
            System.out.println("Enter the next name:");
            word = s.nextLine().toLowerCase();
        }
        System.out.print("[");
        for (String i:
             words) {
            System.out.print(i.substring(0,1).toUpperCase() + i.substring(1).toLowerCase()+ ", ");
        }
        System.out.print("]");

    }
    public static void sort() {
        for (int i = 0; i < words.size(); i++)
        {
            for(int s = i; s < words.size(); s++)
            {
                if (words.get(i).compareTo(words.get(s)) > 0)
                {
                    String iTemp = words.get(i);
                    String sTemp = words.get(s);
                    words.set(i, sTemp);
                    words.set(s, iTemp);
                }
            }
        }
    }
}
