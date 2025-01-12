package Level2ProgramingElement;
/*
 7.	Create a program to swap two numbers 
Hint => 
a.	Create a variable number1 and take user input.
b.	Create a variable number2 and take user input.
c.	Swap number1 and number2  and print the swapped output
I/P => number1, number2
O/P => The swapped numbers are  ___ and ___

 */
import java.util.*;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // take input from the user 
        System.out.println("Enter the first number1  : ");
        int number1 = sc.nextInt();
        System.out.println("Enter the second  number2  : ");
        int number2 = sc.nextInt();
        // using temp varaible we swap these two numbers 

        int  temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("the Swapped number are  :  " + number1  +  " and second  : "+ number2);
    }
}
