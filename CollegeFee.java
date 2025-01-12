package Level1ProgramingElement;
/*
 6.	The University is charging the student a fee
  of INR 125000 for the course. The University is 
  willing to offer a discount of 10%. 
  Write a program to find the discounted amount 
  and discounted price the student will pay for
  the course.
Hint => 
a.	Create a variable named fee and assign 125000 to it.
b.	Create another variable discountPercent and assign 10 to it.
c.	Compute discount and assign it to the discount variable.
d.	Compute and print the fee you have to pay by subtracting the discount from the fee.
O/P => The discount amount is INR ___ and final discounted fee is INR ___
 */
public class CollegeFee {
    public static void main(String[] args) {
    double feeStudent  = 125000;
        double discountPercent = 10;

        double discount= discountPercent /100*feeStudent;
        double payFee =feeStudent - discount;
        // display the result
        System.out.println("the discount amount is INR " + discount + " and final discounted fee is INR " + payFee);
    }
}
