package Level2ProgramingElement;
/*
 5.	Write a TemperaturConversion program, 
 given the temperature in Fahrenheit as 
 input outputs the temperature in Celsius
Hint => 
c.	Create a fahrenheit variable and take the user's input
d.	User the formulae to convert Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C and assign the result to celsiusResult  and print the result
I/P => fahrenheit
O/P => The ____ fahrenheit is _____ celsius

 */
import java.util.*;
public class TempFarenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from the user 
        System.out.println("enter the temp in farenheit : ");
        double farenheit = sc.nextInt();
        // convert farenheit to celsius
        double changeCelsius = (farenheit-32)*5/9;
        // print the result 
        System.out.println("the farhenheit is  : " + farenheit + " and change it to  celsius  :  " + changeCelsius);

    }
}
