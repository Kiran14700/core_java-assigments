import java.util.Scanner;
class Whowon
  {
   public static void main(String args[])
    {
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the score of India: ");
    a=sc.nextInt();
    System.out.println("Enter the score of Pakistan: ");
    b=sc.nextInt();

    if(a>b)
    {
    System.out.println("India won the match");
    }
    else if(a==b)
    {  
    System.out.println("The match is draw");
    }
    else
    {
    System.out.println("Pakistan won the match");
    }
  }
}