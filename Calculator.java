package Level1ProgramingElement;
/*
11.	Write a program to create a basic calculator
 that can perform addition, subtraction, multiplication,
  and division. The program should ask for two
   numbers (floating point) and perform all the
    operations.
Hint => 
a.	Create a variable number1 and number 2 and take user inputs.
b.	Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___

 */
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
// take input from the user of two numbers
        System.out.println("Enter the first number : ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the Second Number : ");
        float num2 =  sc.nextFloat();
        // perform the airthematic operation 
        float add = num1+num2;
        float sub = num1- num2;
        float mult = num1*num2;
        float div = num1/num2;
        System.out.println("the addition subtraction multiplication and division :  " +  add + " " +  sub + "  " + mult + " "  + div );
    }
}
