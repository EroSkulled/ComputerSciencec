/*
 * AP CS MOOC
 * Term 2 - Assignment 1: Time
 * A class which represents the time of day in hours and seconds.
 */

public class Time
{
    private int hour;
    private int minute;
     
     /* Complete required constructors and methods here */

    /*
     *Default constructor that sets time to 0000.
     */
    public Time()
    {
        hour = 0;
        minute = 0;
    }

    /*
     * If h is between 1 and 23 inclusive, set the hour to h.
     * Otherwise, set the hour to 0. If m is between 0 and 59 inclusive,
     * set the minutes to m. Otherwise, set the minutes to 0.
     */
    public Time(int h, int m)
    {
        if (h <= 23 && h >= 1) {
            hour = h;
        }
        if (m <= 59 && m >= 0) {
            minute = m;
        }
    }

    /* Returns the time as a String of length 4 in the format: 0819.
     * Notice that if the hour or minute is one digit, it should
     * print a zero first. For example, 6 should print as 06.
    */
    public String toString()
    {
        String ph = Integer.toString(hour);
        if (ph.length() == 1) {
            ph = "0" + ph;
        }
        String pm = Integer.toString(minute);
        if (pm.length() == 1) {
            pm = "0" + pm;
        }
        return ph+pm;
    }

    /*
     * Returns the time as a String converted from military time
     * to standard time. For example, 0545 becomes 5:45 AM and
     * 1306 becomes 1:06 PM.
     */
    public String convert()
    {
        String AorP = "AM";
        String ph = Integer.toString(hour);
        if (hour > 12) {
            AorP = "PM";
            ph = Integer.toString(Integer.parseInt(ph) - 12);
        }
        if (hour == 0) {
            ph = "12";
        }
        String pm = Integer.toString(minute);
        if (pm.length() == 1) {
            pm = "0" + pm;
        }
        return ph + ":" + pm + " " + AorP;
    }

    /*
     * Advances the time by one minute. 
     * Remember that 60 minutes = 1 hour. 
     * Therefore, if your time was 0359, and you add one minute, 
     * it becomes 0400. 2359 should increment to 0000.
     */
    public void increment()
    {
        if (minute != 59) {
            minute++;
        } else {
            minute = 0;
            if (hour != 23) {
                hour++;
            } else {
                hour = 0;
            }
        }
    }

}