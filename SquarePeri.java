package Level1ProgramingElement;
/*
 11.	Write a program to find the side of the
  square whose parameter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____

 */
import java.util.*;
public class SquarePeri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from the user 
        System.out.println("Enter the perimeter : ");
        double perimeter = sc.nextDouble();
        // caluclate side of perimeter 
        double side = perimeter/4;
        // print the result 
        System.out.println("The length of the side is  : " + side + " whose perimeter is  : " + perimeter) ;
    }
}
