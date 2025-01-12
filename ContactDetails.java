package Level1ProgramingElement;
 import java.util.Scanner;
 /*
 Writing a java code to take user contact details as input
 and display it
  */
public class ContactDetails {
 public static void main(String[] args) {
    // creating variable to store user contact details
    String name ,email, phone;
    int age;
    double height;
    // creating Scanner object to take input from user
    Scanner sc = new Scanner(System.in);
    // taking user details as a input from the user
    System.out.println("Enter yor Name : ");
     name = sc.nextLine();
     System.out.println("Enter the Email : ");
     email = sc.nextLine();
     System.out.println("Enter your phone Number : ");
     phone =  sc.nextLine();
     System.out.println("Enter the age : ");
     age = sc.nextInt();
     System.out.println("Enter the height : ");
     height = sc.nextDouble();
    //  display or print user contact as single line
    System.out.println("user contact details : ");
    System.out.println("Name : " + name + " ,Email : " + email + " , phone : " + phone + " , age : " + age + " ,height : " + height );
    // closing the Scanner
    sc.close();
 }   
}
