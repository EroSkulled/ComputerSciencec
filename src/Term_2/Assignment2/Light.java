//package Term_2.Assignment2;
/*
 * AP CS MOOC
 * Term 2 - Assignment 2, Part 1: Light
 * A class which represents a single light bulb.
 */

import java.util.ArrayList;

public class Light {
    // Variables that will be initialized in the Light constructors.
    private boolean on;
    private boolean burntOut;
    private String color = "";

    // Default constructor that sets the bulb to on, not burnt out, and "white".
    public Light() {
        on = true;
        burntOut = false;
        color = "white";
    }

    // This constructor sets the variable "on" to the parameter o. The burntOut
    // variable is set to the parameter b. If burntOut
    // is true, on is set to false, no matter what value is stored in o.
    // The color variable is set to the parameter c only if c is "red", "green"
    // or "blue". The constructor ignores the case of the value in c. If c holds
    // any value other than "red", "green" or "blue", the constructor sets
    // color to "white".
    public Light(boolean o, boolean b, String c) {
        on = o;
        burntOut = b;
        if (burntOut)
            on = false;
        switch (c.toLowerCase()) {
            case "red":
            case "green":
            case "blue":
                color = c.toLowerCase();
                break;
            default:
                color = "white";
        }
    }

    // The toString method returns a String with the Light in the format:
    // red    off burnt out
    // green    on not burnt out
    //
    // Notice there is a tab between the value for color and "off"/"on"
    // and one space before the "burnt out" or "not burnt out".
    public String toString() {
        String r, q;
        r = on ? "on" :"off";
        q = burntOut ? "burnt out" : "not burnt out";
        return color + "\t" + r + " " + q;
    }

    // This method changes the bulb from on to off, or visa versa. If the
    // burntOut variable is true, then the on variable may only be set to false.
    public void flip() {
        on = !burntOut && !on;
    }

    // The getColor method returns the color of the bulb.
    public String getColor() {
  /* missing code (don't forget to update the return statement) */
        return color;
    }

    // The setColor method sets the color of the Light. The color variable is
    // set to c only if c is "red", "green" or "blue". The method ignore the
    // case of the value in c. If c holds any value other than "red", "green"
    // or "blue", color will be set to "white".
    public void setColor(String c) {
        switch (c.toLowerCase()) {
            case "red":
            case "green":
            case "blue":
                color = c.toLowerCase();
                break;
            default:
                color = "white";
        }
    }

    // The isOn method returns true if on, false otherwise.
    public boolean isOn() {
  /* missing code (don't forget to update the return statement) */
        return on;
    }

    // The burnOut method sets the variable burntOut to true.
    public void burnOut() {
        burntOut = true;
        on = false;
    }

    public static void main(String[] args) {
        
        /* The main method allows you to run Light on its own, with a built-in tester. */

        //*************************************************************************
        // 1. Test Light()
        //*************************************************************************
        Light light1 = new Light();
        System.out.println("1. Test Light()");
        testLight(light1, true, false, "white", "white\ton not burnt out");

        //*************************************************************************
        // 2. Test Light(boolean b, boolean o, String c)
        //*************************************************************************
        System.out.println("\n2. Test Light(boolean b, boolean o, String c)");
        Light light2 = new Light(true, true, "GreeN");
        // Notice that since the light bulb is "burnt out", the value of "on"
        // gets set to false. Also, the color should get saved in all lower case
        // as "green", not "GreeN".
        testLight(light2, false, true, "green", "green\toff burnt out");


        //*************************************************************************
        // 3. Test burnOut()
        //*************************************************************************
        System.out.println("\n3. Test burnOut()");
        // light1 is not burnt out. Lets call burnOut on light1 and make sure it gets burnt out and turned off
        light1.burnOut();
        testLight(light1, false, true, "white", "white\toff burnt out");


        //*************************************************************************
        // 4. Test flip()
        //*************************************************************************
        System.out.println("\n4. Test flip()");
        Light light3 = new Light();
        // light3 is currently on and not burnt out.  Lets flip the light off and on and see if it works properly.
        System.out.println("light3 is on");
        testLight(light3, true, false, "white", "white\ton not burnt out");
        light3.flip();
        System.out.println("now light3 should be off");
        testLight(light3, false, false, "white", "white\toff not burnt out");
        light3.flip();
        System.out.println("now light3 should be back on");
        testLight(light3, true, false, "white", "white\ton not burnt out");
        // Try to flip light1 on - this should fail since light1 is burnt out. light1 should stay off
        System.out.println("light1 is burned out and off, we can't flip it on");
        light1.flip();
        testLight(light1, false, true, "white", "white\toff burnt out");

        //*************************************************************************
        // 5. Test isOn()
        //*************************************************************************
        System.out.println("\n5. Test isOn()");
        // We know light1 is off, and light3 is on.  Verify that the method isOn reports this correctly.
        if (!light1.isOn()) {
            System.out.println("*** PASS: isOn() working properly");
        } else {
            System.out.println("*** FAIL: isOn() not working properly");
        }
        if (light3.isOn()) {
            System.out.println("*** PASS: isOn() working properly");
        } else {
            System.out.println("*** FAIL: isOn() not working properly");
        }

        //*************************************************************************
        // 6. Test getColor()
        //*************************************************************************
        System.out.println("\n6. Test getColor()");
        if (light1.getColor().equals("white")) {
            System.out.println("*** PASS: getColor() working properly");
        } else {
            System.out.println("*** FAIL: problem with getColor()");
        }

        //*************************************************************************
        // 7. Test setColor(String)
        //*************************************************************************
        System.out.println("\n7. Test setColor(String)");
        light1.setColor("red");
        System.out.println("*** " + testLightColor(light1, "red"));
        light1.setColor("BLUE");  // should set light to blue
        System.out.println("*** " + testLightColor(light1, "blue"));
        light1.setColor("yellow"); // yellow is not allowed, should set light to white
        System.out.println("*** " + testLightColor(light1, "white"));
    }

    // Private helper methods

    private static void testLight(Light light, boolean o, boolean b, String c,
                                  String string) {
        System.out.println("*** " + testLightOn(light, o));
        System.out.println("*** " + testLightburntOut(light, b));
        System.out.println("*** " + testLightColor(light, c));
        System.out.println("*** " + testLightToString(light, string));
    }

    private static String testLightOn(Light bulb, boolean o) {
        if ((bulb.on && !o) || (!bulb.on && o)) {
            return "FAIL: on is not set correctly. on should be set to "
                    + o + ", but it is set to " + bulb.on + ".";
        } else {
            return "PASS: on is set correctly (" + bulb.on + ")";
        }
    }

    private static String testLightburntOut(Light light, boolean b) {
        if ((light.burntOut && !b) || (!light.burntOut && b)) {
            return "FAIL: burntOut is not set correctly (burntOut should be set to "
                    + b + ", but it is set to " + light.burntOut + ")";
        } else {
            return "PASS: burntOut is set correctly (" + light.burntOut + ")";
        }
    }

    private static String testLightColor(Light light, String c) {
        if (!light.color.equals(c)) {
            return "FAIL: color is not set correctly (color should be set to "
                    + c + ", but it is set to " + light.color + ")";
        } else {
            return "PASS: color is set correctly (" + light.color + ")";
        }
    }

    private static String testLightToString(Light light, String string) {
        String output;

        if (light.toString().equals(string)) {
            output = "PASS: toString produced the correct output";
        } else {
            output = "FAIL: toString does not work as expected";
        }
        return output + " (" + light.toString() + ")";
    }

    public static class Strand
    {
        // An ArrayList that stores a strand of lights
        private ArrayList<Light> strand = new ArrayList<Light>();

        // Default constructor that sets strand to an ArrayList holding one
        // turned on white bulb, that is not burnt out.
        public Strand()
        {
            /* missing code */
        }

        // A constructor that sets strand to an ArrayList of size n, holding
        // n white bulbs, that are all turned on and not burnt out. If n <= 0,
        // then the strand should be set to size one, with a white bulb, on
        // and not burnt out.
        public Strand(int n)
        {
            /* missing code */
        }

        // This method returns a String representation of the
        // Light objects in the ArrayList, one per line. For example,
        // here is the String returned when toString is called on a
        // Light.Strand with 5 lights:
        //
        // green    on not burnt out
        // red    off not burnt out
        // green    off burnt out
        // blue    on not burnt out
        // red    on not burnt out
        //
        // Note: there is a tab between the value for color and "off"/"on,"
        // and one space before the "burnt out" or "not burnt out".
        public String toString()
        {
            /* missing code (don't forget to update the return statement) */
            return "";
        }

        // This method sets the color of all the light bulbs in the entire Light.Strand.
        public void setColor(String c)
        {

            /* missing code */
        }

        // This method sets the light bulbs to the pattern "blue", "red", "green",
        // "blue", "red", "green", ... until the end of the strand.
        public void setMulti()
        {
            /* missing code */
        }

        // This method turns on all the lights in the strand. Each individual bulb
        // can only be turned on if it's burntOut variable is false.
        public void turnOn()
        {
            /* missing code */
        }

        // This method turns off all the lights in the strand.
        public void turnOff()
        {
            /* missing code */
        }

        // This method sets the Light at location i’s burntOut variable to true.
        public void burnOut(int i)
        {
            /* missing code */
        }

        public static void main(String[] args)
        {
            // *************************************************************************
            // 1. Test Light.Strand()
            // *************************************************************************
            System.out.println("1. Test the default constructor Light.Strand()");
            Strand strand1 = new Strand();
            if (strand1.strand.size() == 1)
                System.out.println("*** PASS: Light.Strand() creates a list of size 1");
            else
                System.out.println("*** FAIL: Light.Strand() creates a list of size "
                        + strand1.strand.size()
                        + ", when a list of size 1 is expected.");

            // ***********************************
            // 2. Test Light.Strand(n)
            // ***********************************
            System.out.println("\n2. Test the constructor Light.Strand(n)");
            // Try to create a strand of lights with 0 bulbs
            Strand emptyStrand = new Strand(0);
            if (emptyStrand.strand.size() == 1)
                System.out.println("*** PASS: Light.Strand(0) creates a list of size 1");
            else
                System.out.println("*** FAIL: Light.Strand(0)  creates a list of size "
                        + emptyStrand.strand.size()
                        + ", when a list of size 1 is expected.");
            // Try to create a strand of lights with a negative number
            Strand negativeStrand = new Strand(-7);
            if (negativeStrand.strand.size() == 1)
                System.out.println("*** PASS: Light.Strand(-7) creates a list of size 1");
            else
                System.out.println("*** FAIL: Light.Strand(-7) creates a list of size "
                        + negativeStrand.strand.size()
                        + ", when a list of size 1 is expected.");
            // Try to create a strand of lights with a positive number
            Strand strandWithFiveBulbs = new Strand(5);
            if (strandWithFiveBulbs.strand.size() == 5)
                System.out.println("*** PASS: Light.Strand(5) creates a list of size 5");
            else
                System.out.println("*** FAIL: Light.Strand(5) creates a list of size "
                        + strandWithFiveBulbs.strand.size()
                        + ", when a list of size 5 is expected.");
            // Verify that all the light bulbs are initialized properly
            boolean success = true;
            for (Light bulb : strandWithFiveBulbs.strand)
            {
                if (!(bulb.isOn() && bulb.getColor().equals("white")))
                {
                    success = false;
                }
            }
            if (strandWithFiveBulbs.strand.size() > 0 && success)
            {
                System.out.println("*** PASS: Light.Strand(5) initialized bulbs correctly");
            }
            else
            {
                System.out.println("*** FAIL: Light.Strand(5) did not initialize bulb(s) correctly");
            }


            // ***********************************
            // 3. Test setColor(String)
            // ***********************************
            System.out.println("\n3. Test setColor(String)");
            // All of the bulbs in our strandWithFiveBulbs are white. Set them to
            // green.
            strandWithFiveBulbs.setColor("green");
            success = true;
            for (Light light : strandWithFiveBulbs.strand)
            {
                if (!light.getColor().equals("green"))
                    success = false;
            }
            if (strandWithFiveBulbs.strand.size() > 0 && success)
                System.out.println("*** PASS: setColor worked as expected (green test)");
            else
                System.out.println("*** FAIL: setColor did not work as expected (green test)");
            // Now try to set them to a color that is not supported.  This should
            // cause all the bulbs to be set back to white.
            strandWithFiveBulbs.setColor("pink");
            success = true;
            for (Light light : strandWithFiveBulbs.strand)
            {
                if (!light.getColor().equals("white"))
                    success = false;
            }
            if (strandWithFiveBulbs.strand.size() > 0 && success)
                System.out.println("*** PASS: setColor worked as expected (pink test)");
            else
                System.out.println("*** FAIL: setColor did not work as expected (pink test)");


            // ***********************************
            // 4. Test turnOff()
            // ***********************************
            System.out.println("\n4. Test turnOff()");
            strand1.turnOff();
            if (strand1.strand.size() > 0 && !strand1.strand.get(0).isOn())
            {
                System.out.println("*** PASS: turnOff() worked as expected");
            }
            else
            {
                System.out.println("*** FAIL: turnOff() did not work as expected");
            }

            // ***********************************
            // 5. Test turnOn()
            // ***********************************
            System.out.println("\n5. Test turnOn()");
            strand1.turnOn();
            if (strand1.strand.size() > 0 && strand1.strand.get(0).isOn())
            {
                System.out.println("*** PASS: turnOn() worked as expected");
            }
            else
            {
                System.out.println("*** FAIL: turnOn() did not work as expected");
            }

            // ***********************************
            // 6. Test burnOut(int)
            // ***********************************
            System.out.println("\n6. Test burnOut(n)");
            strand1.burnOut(0);
            if (strand1.toString().equals("white\toff burnt out\n"))
            {
                System.out.println("*** PASS: burnOut(1) works as expected.");
            }
            else
            {
                System.out.println("*** FAIL: burnOut(1) does not work as expected.");
            }
        }
    }
}