import java.util.Scanner;
class Empty
{
   public static void main(String args[])   //main method
   {
      //declaration  of variables
      int a,b,temp;

    

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of a and b:");
      a=sc.nextInt();      
      b=sc.nextInt();

      System.out.println("Before Swaping:"+a+" "+b);
      //Swaping
      temp=a;
      a=b;
      b=temp;
      
      System.out.println("After Swaping:"+a+" "+b);
      sc.close();
}
}