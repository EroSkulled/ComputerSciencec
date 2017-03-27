import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Akatsuki on 3/24/17.
 */
public class Main {
    public static String $;
    public static ArrayList<String> $$;

    public static void main(String[] var0) {
        Scanner $$$ = new Scanner(System.in);
        System.out.println("Enter the next name:");
        $ = $$$.nextLine().toLowerCase();
        $$ = new ArrayList<String>();
        while (!$.equals("end")) {
            $$.add($);
            $$$$$$$$$$();
            System.out.println("Enter the next name:");
            $ = $$$.nextLine().toLowerCase();
        }
        System.out.print("[");
        for (String $$$$$$:
                $$) {
            System.out.print($$$$$$.substring(0,1).toUpperCase() + $$$$$$.substring(1).toLowerCase()+ ", ");
        }
        System.out.print("]");

    }
    public static void $$$$$$$$$$() {
        for (int i = 0; i < $$.size(); i++)
        {
            for(int s = i; s < $$.size(); s++)
            {
                if ($$.get(i).compareTo($$.get(s)) > 0)
                {
                    String $$$$ = $$.get(i);
                    String $$$$$ = $$.get(s);
                    $$.set(i, $$$$$);
                    $$.set(s, $$$$);
                }
            }
        }
    }
}
