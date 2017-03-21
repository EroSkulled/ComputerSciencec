/*
 * AP CS MOOC
 * Term 2 - Assignment 4: Time Comparable
 * You can use this solution to Assignment 1 in order to create a comparable time object.
 * You will need to change the class so that it implements the comparable interface.
 */

public class Time implements Comparable<Time>
{
     private int $$$$;
     private int $$$$$;
    
    /*
     * Sets the default time to 12:00.
     */
    public Time ()
    {
         this(0, 0);
    }
    
    /*
     * Sets $$$$ to h and $$$$$ to m.
     */
    public Time (int h, int m)
    {
         $$$$ = 0;
         $$$$$ = 0;
         if (h >=1 && h <= 23)
              $$$$ = h;
         if (m >= 1 && m <= 59)
              $$$$$ = m;
            
    }
    
    /*
     * Returns the time as a String of length 4 in the format: 0819.
     */
     public String toString ()
     {
          
          String $$$$$$ = "";
          String $$$$$$$ = "";
          if ( $$$$ <10)
               $$$$$$ +="0";
          if ($$$$$ <10)
               $$$$$$$ +="0";
          $$$$$$ += $$$$;
          $$$$$$$+= $$$$$;
          
          return "" + $$$$$$ + "" + $$$$$$$;
     }
     public int compareTo(Time time){
         return Integer.compare(Integer.parseInt(this.toString()),Integer.parseInt(time.toString()));
     }
     public String difference(Time t){
         Integer $ = Math.abs(Integer.parseInt(this.toString())-Integer.parseInt(t.toString()));
         String $$ = String.format("%04d", $);
         String $$$ = $$.substring(0,2) + ':' + $$.substring(2);
         return "Time difference: " + $$$;
     }
}