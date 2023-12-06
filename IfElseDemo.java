/*   if(test condition)
{
block of code;
}
else
{
block of code;
}
*/

import java.util.Scanner;
class IfElseDemo
  {
   public static void main(String args[])
    {
     int num;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number");  
     num=sc.nextInt();

     if(num>0)
      {
       System.out.println("You have entered Positive integer:"+num);
      }
      else
      {
      System.out.println("You have entered Negative integer:"+num);
      }
   }
}