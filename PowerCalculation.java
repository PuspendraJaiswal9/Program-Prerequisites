import java.util.Scanner;
class PowerCalculation{
       public static void main(String args[])
       {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Base:");
         int base=sc.nextInt();
         System.out.println("Enter exponent:");
         int exponent=sc.nextInt();
         double power=Math.pow(base,exponent);
         System.out.println("Power="+power);
       }
}