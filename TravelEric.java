package Level2ProgramingElement;
/*
 - 8  Eric Travels from Chennai to Bangalore 
 via Vellore. From Chennai to Vellore distance
  is 156.6 km and the time taken is 4 Hours 4 Mins
   and from Vellore to Bangalore is 211.8 km
    and will take 4 Hours 25 Mins.
     Compute the total distance and total time
      from Chennai to Bangalore
      a.	Create variables and take user inputs for name, fromCity, viaCity, toCity
b.	Create variables and take user inputs for distances fromToVia and viaToFinalCity in Miles
c.	Create Variables and take time taken 
d.	Finally, print the result and try to understand operator precedence.

 */
import java.util.*;
public class TravelEric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from the user
        // take input as a name  
        System.out.println("Enter the name : ");
        String name = sc.nextLine();
        // take input as a city 
        System.out.println("enter the starting   city : ");
        String fromCity =  sc.nextLine();
        System.out.println("enter the via    city : ");
        String viaCity =  sc.nextLine();
        System.out.println("enter the detination   city : ");
        String toCity =  sc.nextLine();

        // take user input for distance in miles 
        System.out.println("Enter the distance from  " + fromCity + " to " + viaCity + "  in miles : " );
        double fromToVia= sc.nextDouble();
        System.out.println("Enter the distance from  " + viaCity + " to " + toCity  + "  in miles : " );
        double viaToFinalCity= sc.nextDouble();

        // take user input time taken 
        System.out.println("enter the time taken from  : "  + fromCity +   " to "  + viaCity + " hour minutes ");
        int hours1 = sc.nextInt(); 
        int minutes1 = sc.nextInt();
        System.out.println("enter the time taken from  : "  + viaCity +   " to "  + toCity + " hour minutes ");
        int hours2 = sc.nextInt(); 
        int minutes2 = sc.nextInt();
        // calculate total distance 
        double totalDistance = fromToVia+ viaToFinalCity;

        // calculate total time 
        int totalMinutes1 = (hours1 * 60) + minutes1;
         int totalMinutes2 = (hours2 * 60) + minutes2;
          int totalMinutes = totalMinutes1 + totalMinutes2; 
          int totalHours = totalMinutes / 60;
           int remainingMinutes = totalMinutes % 60;
// to print the result 
        System.out.println("the total distance from : "  + fromCity + " to "  + viaCity +   " final : " + toCity  + " is " + totalDistance + " miles." );
        System.out.println("The total time taken is " + totalHours + " hours and " + remainingMinutes + " minutes.");

    }
}
