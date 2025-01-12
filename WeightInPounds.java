package Level2ProgramingElement;
/*
 12.	Create a program to convert weight in
  pounds to kilograms.
Hint => 1 pound = 2.2 kg
I/P => weight
O/P => The weight of the person in pound is ___ and in kg is ___


 */
import java.util.*;
public class WeightInPounds {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        // take input from the user 
        System.out.println("enter the weight  of a person  : ");
        double weight = sc.nextDouble();
        // convert weight in pound 
        double changeInPound = weight*2.2;
        // print the result 
        System.out.println("the Weight of the person in pound is  : " + changeInPound);
    }
}
