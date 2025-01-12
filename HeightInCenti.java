package Level1ProgramingElement;
/*
 10.	Write a program that takes your height
  in centimeters and converts it into feet and 
  inches.
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

 */
import java.util.*;
public class HeightInCenti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from the user 
        System.out.println("Enter the height : ");
        double  height = sc.nextDouble();
        // convert height in foot 
        double convertFoot = 12*height;
        // convert height in inch i inch = 2.54cm
        double convertInch = 2.54*height;
        System.out.println("Your height in cm is : " +height + " while in feet is : "+convertFoot + " and inches is  : "  + convertInch);
    }
}
