package Level2ProgramingElement;
/*
 10.	Create a program to divide N number of 
 chocolates among M children.
Hint => 
a.	Get an integer value from user for the numberOfchocolates and numberOfChildren.
b.	Find the number of chocolates each child gets and number of remaining chocolates
c.	Display the results
I/P => numberOfchocolates, numberOfChildren
O/P => The number of chocolates each child gets is ___ and the number of remaining chocolates are ___

 */
import java.util.*;
public class Choclates {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
    //    take input from the user 
        System.out.println("Enter the number of choclates : ");
        int numberOfCholates = sc.nextInt();
        System.out.println("Enter the number of childrean  : ");
        int numberOfChildrean = sc.nextInt();
        // divide Equally from each child
        int equallyDistributed = numberOfCholates/numberOfChildrean;
        // the remaining choclates
        int remaining = numberOfCholates %numberOfChildrean;
        // print the result 
        System.out.println("the number of choclates each child grts is   " + equallyDistributed +  "and the number of remaining choclates are  : "  + remaining);
    }
}
