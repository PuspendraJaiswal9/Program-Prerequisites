import java.util.Scanner;
class ConvertKilometerstoMiles{
       public static void main(String args[])
       {
         Scanner sc=new Scanner(System.in);
         int Kilometers=sc.nextInt();
         double Miles = Kilometers * 0.621371;
         System.out.println("Miles="+Miles);
       }
}