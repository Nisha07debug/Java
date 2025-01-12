package Level1ProgramingElement;

/*
 1.	Write a program to find the age of Harry 
 if the birth year is 2000. Assume the Current Year
  is 2024
I/P => NONE
O/P => Harry's age in 2024 is ___ 

 */
public class ClaculateAge {
    public static void main(String[] args) {
        int birthYear = 2000;
        int currentYear = 2024;
        int realAge = currentYear- birthYear;
        System.out.println(" harry's age in 2024 is : " +realAge);
    }
}
