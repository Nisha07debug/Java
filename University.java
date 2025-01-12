package Level1ProgramingElement;
import java.util.Scanner;
// Question 9 Similar to #6
public class University {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from the user
        System.out.println("enter the  student  fee : ");
        double feeStudent = sc.nextDouble();
        System.out.println("enter the disocount percent : ");
        double discountPercent = sc.nextDouble();
        double discont = (discountPercent/100)*feeStudent;
        // 
        double discontFee = feeStudent-discont;
        // display or print the result 
        System.out.println("the discount is : " +discont + "the discounted  fee is : " + discontFee );
    }
}
