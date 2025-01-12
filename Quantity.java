package Level1ProgramingElement;
import java.util.*;
/*
15.	Write a program to input the unit price of an
 item and the quantity to be bought. Then, 
 calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___

 */
public class Quantity {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // take input from the user
       

        System.out.println("Enter the item price : ");
        int  priceItem = sc.nextInt();
        System.out.println("enter the Quantity : ");
        int quantityItem = sc.nextInt();
       
        // calculate the total price of an item 
            int totalPrice = priceItem*quantityItem;
            // print the result 
            System.out.println("the total purchase price is INR : " + totalPrice + "if th Quantity is  : "+ quantityItem + " then the unit price is : " +priceItem);
    }
}
 