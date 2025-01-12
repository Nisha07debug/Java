package Level1ProgramingElement;
/*
 12.	Write a program the find the distance
  in yards and miles for the distance provided 
  by user in feets. 
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

 */
import java.util.*;
public class DistanceInYards {
   public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    // take input from the user 
    System.out.println("Enter the distance in feet : ");
    double distanceInFeet = sc.nextDouble();
    // caluclate  or convert  feet  distance in yards 
    double distanceInYards = distanceInFeet/3;
    // calculate feet  distance in miles 
    double distanceInMiles = distanceInYards*1760;
    // dispay the output
    System.out.println("Your height in cm is : " +  distanceInFeet  +   "while in yards is : "  +  distanceInYards  +  "and inches is : "  +   distanceInMiles );
   }
}
