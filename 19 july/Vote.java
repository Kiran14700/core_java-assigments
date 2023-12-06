import java.util.Scanner;
class Vote
  {
   public static void main(String args[])
     {
     int num;
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter your age");
     num=sc.nextInt();

      if(num>=18)
      {
      System.out.println("You are eligble for voting");
      }
      else
      {
      System.out.print("You are not eligble for voting");
      }
   }
}