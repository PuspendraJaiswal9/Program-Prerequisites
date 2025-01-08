import java.util.Scanner;
class VolumeofaCylinder{
       public static void main(String args[])
       {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter radius:");
          double radius=sc.nextDouble();
          System.out.println("Enter height:");
          double height=sc.nextDouble();
          double Volume = Math.PI * Math.pow(radius, 2)*height;
          System.out.println("Volume = "+Volume); 
       }
}