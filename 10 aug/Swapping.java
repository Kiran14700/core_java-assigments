//Write a program to swap two numbers without using a third variable
import java.util.Scanner;
class Swap
  {   
    int num1,num2;
    Scanner sc=new Scanner(System.in);
    
        public void accept()
        {
           System.out.println("Enter the first number");
           num1=sc.nextInt();
           System.out.println("Enter the second number");
           num2=sc.nextInt();
        }
        public void display()
        {
           System.out.println("Before swapping your first number is:"+num1+" and second number is:"+num2);
           num1=num1+num2;
           num2=num1-num2;
           num1=num1-num2;
           System.out.println("After swapping your first number swapped to :"+num1+" and second number swapped to :"+num2);
        }
    }

public class Swapping
  {
   public static void main (String args[])
     { 
       Swap obj=new Swap();
       obj.accept();
       obj.display();
     }
  }