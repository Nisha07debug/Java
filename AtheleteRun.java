package Level2ProgramingElement;
/*
    9.	An athlete runs in a triangular park 
    with sides provided as input by the user in
     meters. If the athlete wants to complete a
      5 km run, then how many rounds must the
       athlete complete.
Hint => The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
I/P => side1, side2, side3
O/P => The total number of rounds the athlete will run is ___ to complete 5 km

 */
import java.util.*;
public class AtheleteRun {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // taking side as a input from the user
        System.out.println("Enter the length of  side  1  in meter : ");
        double side1 = sc.nextDouble();

 System.out.println("Enter the length of  side  2   in meter : ");
        double side2 = sc.nextDouble();

        System.out.println("Enter the length of  side  3  in meter : ");
        double side3  = sc.nextDouble();
        // calculate the perimeter of the triangular park 
        double perimeter = side1+ side2 + side3;
        // convert 5 km to meter
        double totalDistanceInMeter = 5*1000;
        // calculate the number of rounds 
        double nuberOfRounds = totalDistanceInMeter /perimeter;
        // output the result 
        System.out.println("the total number of rounds the athlete will run is " + nuberOfRounds +  " to complete 5 km.");
    }
}
