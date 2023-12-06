
import java.util.Scanner; //Scanner object is imported
class Integer
 {
  public static void main(String args[])
   {
   double a;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number:");
   a=sc.nextDouble();
   //logics for the given conditions

   if(a>0) 
   { 
   System.out.print("The number is positive");
   }
   else if(a<0)
   {
   System.out.print("The number is negative");
   }
   else
   {
   System.out.println("The number is zero");
   }
   sc.close();
   }
 }