package Level2ProgramingElement;
/*
 2.	Write an IntOperation program by taking a, b,
  and c as input values and print the following 
  integer operations
   a + b *c, a * b + c, c + a / b,
   and a % b + c. Please also understand the
    precedence of the operators. 
Hint => 
a.	Create variables a, b, c of int data type.
b.	Take user input for a, b, and c.
c.	Compute 3 integer operations and assign result to a variable
d.	Finally print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are —-, -—, and —-

 */
import java.util.*;

public class precedenceOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from the user
       
        System.out.println("enter the value of  a  : ");
        int a = sc.nextInt(); 

        System.out.println("enter the value of  b  : ");
        int b = sc.nextInt(); 

        System.out.println("enter the value of  c : ");
        int c = sc.nextInt(); 

        int result1 = a+b*c;
        int result2 = a*b+c;
        int result3 = c+a/b;
        int result4 = a%b+c;
        // print the result
        System.out.println("the result 1 : " +result1);
        System.out.println("the result 2 : " +result2);
        System.out.println("the result 3 : " +result3);
        System.out.println("the result 4 : " +result4);
        
    }
}
