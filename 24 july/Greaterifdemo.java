import java.util.Scanner; //Scanner object is imported
class Greaterifdemo
{
   public static void main(String args[])
   {
   int a;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number:");
   a=sc.nextInt();
   //logics for the given conditions
   if(a<100)
   { 
   System.out.println("The entered number is less than 100");
     if(a>50)
     {
      System.out.println("The entered number is greater than 50");
     }
   }
   else{
   System.out.println("The entered number is greater than 100");

  }
 }
}