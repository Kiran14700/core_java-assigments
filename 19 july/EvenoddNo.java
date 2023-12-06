import java.util.Scanner;
public class EvenoddNo
{
  public static void main(String args[])
  {
   int a;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter your number");
   a=sc.nextInt();


    if(a%2==0)
    {
    System.out.println("It is an even number");
    }
    else
    {
    System.out.print("It is an odd number");
    }
  }
}