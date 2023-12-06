import java.util.Scanner;    
class Base2
     {
         public float a=50000,b,c;
         Scanner sc=new Scanner(System.in);
         public void accept()
         {
             System.out.println("Your present balance is"+a);
             System.out.println("Enter the amount you want to withdraw");         
             b=sc.nextFloat();
             System.out.println("Enter the amount you want to deposit");
             c=sc.nextFloat();
          }
      }
     
         class Derived1 extends Base2
         {
            public void display()
            {
              
              System.out.println("you withdraw "+b+" Rs your present balance is"+(a-b));
              System.out.println("you deposit "+c+" Rs your present balance is"+(a+b));
           }
         }
         public class InheriDemo1
         {
             public static void main(String args[])
             {
               Derived1 d=new Derived1();
               d.accept();
               d.display();
             }
         }
   