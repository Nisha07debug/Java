package Level1ProgramingElement;
/*
 4.	Create a program to calculate the profit and loss 
 in number and percentage based on the cost price 
 of INR 129 and the selling price of INR 191. 
Hint => 
a.	Use a single print statement to
 display multiline text and variables.
b.	Profit = selling price - cost price
c.	Profit Percentage = profit / cost price * 100
I/P => NONE
O/P => 
The Cost Price is INR ___ and Selling Price is INR ___
The Profit is INR ___ and the Profit Percentage is ___

 */
public class CalculateProfitLoss {
    public static void main(String []args){
        // taking variable to show the costprice
        int costPrice = 129, sellingPrice = 191;
        // calculate profit 
        int profit = sellingPrice-costPrice;
        // profit percentage
        int profitPercentage = profit/costPrice*100;
// print the result or display the result
System.out.println("THe cost price is INR " + costPrice + "and selling price is INR " + sellingPrice);
System.out.println("The profit is INR "+  profit + " and the profit percentage is " +profitPercentage);
    }
}
