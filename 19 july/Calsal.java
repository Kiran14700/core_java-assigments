//Calcuate total salary of Employee
import java.util.Scanner;
class Calsal
{
   public static void main(String args[])   //main method
   {
      //declaration  of variables
      int basicsal;
      float da;  //float is 4bytes then double is 8 bytes
      double hra,gross;

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your Basic Salary:");
      basicsal=sc.nextInt();
      System.out.println("Enter your daily allowance:");
      da=sc.nextFloat();
      System.out.println("Enter your hra:");
      hra=sc.nextDouble();
      gross=basicsal+da+hra;
      System.out.println("The total salary is:"+gross);
      sc.close();
   }
}
     
    
   