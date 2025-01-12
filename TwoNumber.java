package Level2ProgramingElement;
/*
 1.	Write a program to take 2 numbers and
  print their quotient and reminder.
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___

 */
import java.util.*;
public class TwoNumber {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        // take input from the user
        System.out.println("Enter the First number : ");
        int num1 = sc.nextInt();
    
        System.out.println("enter the second number : ");
        int num2 = sc.nextInt();
        // calculate for Quotient
        int getQuotient = num1/num2;
        // calculate for remainder
        int getRemainder = num1%num2;
        // print the result
        System.out.println("the Quotient is  : " + getQuotient + " and remainder is : " + getRemainder + " of two number : " + num1 + "and : " +num2);
    }
}
