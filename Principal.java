package Level2ProgramingElement;
/*
11.	Write a program to input the Principal, Rate,
 and Time values and calculate Simple Interest.
Hint => Simple Interest = Principal * Rate * Time / 100
I/P => principal, rate, time
O/P => The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___

 */
import java .util.*;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from the user
        System.out.println("Enter the principal  : ");
        double principal = sc.nextDouble();

        System.out.println("Enter the rate   : ");
        double rate  = sc.nextDouble();

        System.out.println("Enter the time   : ");
        double time = sc.nextDouble(); 
        //  calculate Simple interest 
        double simpleInterest = principal*rate*time/100;
        // print the result 
        System.out.println("the simple  interest is " + simpleInterest);

    }
}
