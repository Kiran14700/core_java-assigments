
import java.util.Scanner; //Scanner object is imported
class Greatest1
  {
   public static void main(String args[])
    {
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the First number:");
    a=sc.nextInt();
    System.out.println("Enter the Second number:");
    b=sc.nextInt();
    System.out.println("Enter the Third number:");
    c=sc.nextInt();


   //logics for the given conditions

   if(a>b && a>c) 
   {  
   System.out.print("First number "+a+"is the greatest number");
   }
   else if(b>a && b>c)
   {
   System.out.print("Second number "+b+" is the greatest number");
   }
   else 
   {
   System.out.println("Third number "+c+" is the greatest number");
   }
  }
}





