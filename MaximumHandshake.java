package Level1ProgramingElement;
/*
 16.	Create a program to find the maximum
  number of handshakes among N number of students.
Hint => 
a.	Get integer input for numberOfStudents variable.
b.	Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
c.	Display the number of possible handshakes.

 */
import java.util.*;
public class MaximumHandshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from the user
        System.out.println("Enter the number of Student : ");
        int numberOfStudents = sc.nextInt();

        // calculate the number of hanshakes 
        int handshakes = (numberOfStudents*(numberOfStudents-1))/2;
        // display the result
        System.out.println("the maximum  number of possible handshakes among : " +numberOfStudents + " student is " + handshakes);
    }
}
