import java.util.Scanner;
class CelsiustoFahrenheitConversion{
       public static void main(String args[])
       {
          Scanner sc=new Scanner(System.in);
          //Fahrenheit = (Celsius * 9/5) + 32.
          System.out.println("Enter temperature in Celsius:");
          double Celsius=sc.nextDouble();
          double Fahrenheit = (Celsius * 9/5) + 32;
          System.out.println("Fahrenheit = "+Fahrenheit); 
       }
}