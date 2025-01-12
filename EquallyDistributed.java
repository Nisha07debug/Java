package Level1ProgramingElement;

/*
 5.	Suppose you have to divide 14 pens among 3
  students equally. Write a program to find how 
  many pens each student will get 
  if the pens must be divided equally. 
  Also, find the remaining non-distributed pens.
Hint => 
a.	Use Modulus Operator (%) to find the reminder.
b.	Use Division Operator to find the Quantity of pens
I/P => NONE
O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___

 */
public class EquallyDistributed {
    public static void main(String[] args) {
        int pens = 14,student = 3;
        int perStudent = 14/3;
        int remainingPens = 14%3;
        // print the result 
        System.out.println("The pen per Student is  " + perStudent + " and the remaining pen not distributed is  " +remainingPens);
    }
}
