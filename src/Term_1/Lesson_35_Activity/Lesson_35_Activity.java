package Term_1.Lesson_35_Activity;/*
 * Lesson 35 Coding Activity
 * 
 * Write four overloaded methods called randomize. Each method will
 * return a random number based on the parameters that it receives:
 * 
 * Write four overloaded methods called randomize. 
 * Each method will return a random number based on the parameters that it receives:
 * randomize() - Returns a random int between min and max inclusive. Must have two int parameters. 
 * randomize() - Returns a random int between 0 and max inclusive. Must have one int parameter. 
 * randomize() - Returns a random double between min and max inclusive. Must have two double parameters. 
 * randomize() - Returns a random double between 0 and max inclusive. Must have one double parameter. 
 * 
 * Because these methods are overloaded, they should be declared in the same class. 
 * To simulate this, copy all four methods into the single Code Runner box.
 */


class Lesson_35_Activity {
  
    static public int randomize(int min, int max){
        Integer diff = max - min + 1;
        return (int) (Math.random()*diff) + min;
    }
     
     /*randomize()
      * This method must have one int parameter max. 
      * Returns a random int between 0 and max inclusive.
    {
    //Write your code here
    //Change the return value as you see fit
    }
    */
     static public int randomize(int max){
         return randomize(0, max);
     }
  
    /*randomize()
     * This method must have two double parameters. 
     * This method returns a random double between min and max inclusive.
    {
    //Write your code here
    //Change the return value as you see fit 
    }    
    */
    static public double randomize(double min, double max){
        double diff = max - min;
        return (Math.random()*diff) + min;
    }
  
    /*randomize()
     * This method must have one double parameter.
     * This method returns a random double between 0 and max inclusive.
    {
    //Write your code here
    //Change the return value as you see fit
    }    
    */
    static public double randomize(double max){
        return randomize(0.0, max);
    }
     
    public static void main(String[] args)
     {
     for(int i = 0;i < 100;i++){
         System.out.println(randomize(1.5,3.5));
     }
    }
}