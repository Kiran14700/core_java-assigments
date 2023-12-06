
import java.util.Scanner; //Scanner object is imported
class sqcube
 {
   public static void main(String args[])
   {
   int a;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number:");
   a=sc.nextInt();
   //logics for the given conditions

   if(a==0)
   { 
   System.out.print("Zero is not acceptable");
   }
   else if(a%2==0)
   {
   System.out.print("The number is even and its square is:"+a*a);
   }
   else 
   {
   System.out.print("The number is odd and its cube is:"+a*a*a);
   }
   sc.close();
  }
}


