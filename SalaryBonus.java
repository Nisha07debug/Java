package Level2ProgramingElement;
/*
 6.	Create a program to find the total income of
  a person by taking salary and bonus from user.
Hint => 
a.	Create a variable named salary and take user input.
b.	Create another variable bonus and take user input.
c.	Compute income by adding salary and bonus and print the result
I/P => salary, bonus
O/P => The salary is INR ___ and bonus is INR ___. Hence Total Income is INR ___

 */
import java.util.*;
public class SalaryBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // take input from the user 
        System.out.println("Enter the Salary of a person : ");
        int salary = sc.nextInt();
        System.out.println("enter the bouns tou gave : ");
        int bonus = sc.nextInt();
        int totalIncome = salary+bonus;
        // print the total inconme
        System.out.println("The Salary is : "  + salary +  " and bonus is :  "  + bonus +  "hence Total income is INR :    "  + totalIncome);
    }
}
