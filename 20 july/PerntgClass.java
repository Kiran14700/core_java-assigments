import java.util.Scanner;
class PerntgClass
  {
    public static void main(String args[])
      {
       int per;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Your Percenatage: ");
       per=sc.nextInt();

       if(per>=75)   //used AND operation
       {
       System.out.println("You result is distinction");
       }
       else if(per<75 && per>60)
       {
       System.out.println("Your result is first class");
       }
       else if(per<60 && per>=45)
       {
       System.out.println("Your result is second class");
       }
       else if(per>=35 && per>=45)
       {
       System.out.println("You are pass");
       }
       else
       {
       System.out.println("You are fail");
       }
    }
}
