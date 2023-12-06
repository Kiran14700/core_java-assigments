import java.util.Scanner;
class IfDemo
 {
  public static void main(String args[])
   {
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number");
    num=sc.nextInt();

    if(num>0) //this returns boolean expression True or False
     {
      System.out.println("Welcome to java programming");
      }
      System.out.print("Enjoy your day");
    }
}