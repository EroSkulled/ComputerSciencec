
import java.io.IOException;

/**
 * Created by walterhuang on 3/21/17.
 */
public class Lesson_15_Activity {

    public static String [] list = { "against" , "forms" , "belief" , "government" , "democratic" , "movement" , "understanding"};

    public static void main(String str[]) throws IOException {

        sortAndPrint(list);
    }
    public static void sortAndPrint (String [] list)
    {
        for (int i = 0; i < list.length; i++)
        {
            for(int s = i; s < list.length; s++)
            {
                if (list[i].compareTo(list[s]) > 0)
                {
                    String iTemp = list[i];
                    String sTemp = list[s];
                    list[i] = sTemp;
                    list[s] = iTemp;
                }
            }
        }
        for (int c = 0; c < list.length; c++)
        {
            System.out.print (list[c] + "  ");
        }
    }


}

