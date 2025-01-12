package Level1ProgramingElement;
import java.util.Scanner;
/*
 - Write a program to display Sam with Roll Number 1,
  Percent Marks 99.99, and the result ‘P’ 
  indicates Pass(‘P’) or Fail (‘F’). 

IMP => Follow Good Programming Practice demonstrated below in all Practice Programs

 */
public class DisplayResult {
    public static void main(String[] args) {
        // creating a String variable name and assign sam
        String name = "sam";
        int rollNumber = 1;
        double Marks =66.99;
        // for Simgale character we use pass or fail
        char pass = 'p';
        // print the result or display the result
        System.out.println("name " + name+ " with roll number : " +rollNumber+ "has Scored "+ Marks+ " then result " + pass);
    }
}
