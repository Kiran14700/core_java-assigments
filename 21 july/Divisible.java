import java.util.Scanner; //Scanner object is imported
class Divisible
  {
   public static void main(String args[])
    {
     int a;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number:");
      a=sc.nextInt();

     //logics for the given conditions

     if(a%5==0 && a%3==0) 
     {  
     System.out.println("The number is divisble by 5 and 3");
     }
     else if(a%5==0 || a%3==0) //Or condition is used
     {  
     System.out.println("The number is either divisble by 5 and 3");
     }
     else 
     {
     System.out.println("It is not divisble by 5 and 3");
     }
   }
 }