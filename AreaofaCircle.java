import java.util.Scanner;
class AreaofaCircle{
       public static void main(String args[])
       {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter radius:");
          double radius=sc.nextDouble();
          double area = Math.PI * Math.pow(radius, 2);
          System.out.println("Area = "+area); 
       }
}