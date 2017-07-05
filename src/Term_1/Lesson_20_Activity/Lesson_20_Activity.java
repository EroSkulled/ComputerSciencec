package Term_1.Lesson_20_Activity;/*
 * Lesson 20 Coding Activity 
 * 
 * Computer science jobs are in demand. Right now we have a shortage 
 * of people that can do computer programming, and one of the fastest
 * growing areas of new jobs in the sector are so-called hybrid jobs. 
 * This means you specialize in an area like biology, 
 * and then use computer programming to do your job. 
 * 
 * These hybrid jobs exist in the arts, sciences,
 * economics, healthcare, and entertainment fields.
 * 
 * One of these jobs is computational biology. Computational Biology, 
 * sometimes referred to as bioinformatics, is the science of 
 * using biological data to develop algorithms and relations
 * among various biological systems.
 * 
 * In this lab we are going to investigate the data from a
 * grey seal named Gracie. We�ll input the longitude and
 * latitude data from a tracking device. We want to investigate 
 * the farthest north, south, east and west Gracie has been.
 * 
 * We will use the latitude to measure this.
 * Write a program to enter Gracie�s longitude and Latitude data. 
 * Each time through the loop it should ask if you want to continue. 
 * Enter 1 to repeat, 0 to stop.
 * 
 * Any value for latitude not between -90 and 90 inclusive should be ignored.
 * 
 * Any value for longitude not between -180 and 180 inclusive should be ignored.
 *
 *
 *          Sample Run:
 *
 *              Please enter the latitude:
 *              41.678
 *              Please enter the longitude:
 *              69.938
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              41.755
 *              Please enter the longitude:
 *              69.862
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              41.829
 *              Please enter the longitude:
 *              69.947
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              300
 *              Please enter the longitude:
 *              69.947
 *              Incorrect Latitude or Longitude
 *              Please enter the latitude:
 *              41.827
 *              Please enter the longitude: 
 *              69.904
 *              Would you like to enter another location?
 *              0
 *              Farthest North: 41.829
 *              Farthest South: 41.678
 *              Farthest East: 69.947  
 *              Farthest West: 69.862
 *   
 */ 

import java.util.Scanner;

class Lesson_20_Activity{
    public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         int status = 1;
         double nla = 0;
         double nlo = 0;
         double lam = 0;
         double lami = 10000;
         double lom = 0;
         double lomi = 10000;
         while(status != 0){
             System.out.println("Please enter the latitude:");
             nla = scan.nextDouble();
             System.out.println("Please enter the latitude:");
             nlo = scan.nextDouble();
             if(nla <= 90 && nla >= -90 && nlo <= 180 && nlo >= -180) {
                 if (nla >= lam) {
                     lam = nla;
                 }
                 if (nla <= lami) {
                     lami = nla;
                 }
                 if (nlo >= lom) {
                     lom = nlo;
                 }
                 if (nlo <= lomi) {
                     lomi = nlo;
                 }
                 System.out.println("Would you like to enter another location?");
                 status = scan.nextInt();
             } else {
                 System.out.println("Incorrect Latitude or Longitude");
             }

         }
         System.out.println("Farthest North: " + lam);
         System.out.println("Farthest South: " + lami);
         System.out.println("Farthest East: " + lom);
         System.out.println("Farthest West: " + lomi);

}
}