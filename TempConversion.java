package Level2ProgramingElement;
/*
 4.	Write a TemperaturConversion program, 
 given the temperature in Celsius as input
  outputs the temperature in Fahrenheit
Hint => 
a.	Create a celsius variable and take the temperature as user input
b.	Use the Formulae Celsius to Fahrenheit:  
 (°C × 9/5) + 32 = °F and assign to farenheitResult  and print the result
I/P => celcius
O/P =>  The ____ celsius is _____ fahrenheit

 */
import java.util.Scanner;
public class TempConversion {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // take input from the user 
        System.out.println("enter the temperature : ");
        int tempCelsius = sc.nextInt();
        // calculate the change in farenheit 
        double  changeFarhenheit = (tempCelsius*9/5)+32;
        // print the result 
        System.out.println("the : " +tempCelsius + " temp  celsius is : "  + changeFarhenheit  + " farhenheit");
    }
}
