import java.util.*;    
class Base1
     {
         int a,b,res;
         Scanner sc=new Scanner(System.in);
         public void inputData()
         {
             System.out.println("Enter first number");         
             a=sc.nextInt();
             System.out.println("Enter second number");
             b=sc.nextInt();
          }
      }
     
         class D1 extends Base1
         {
            public void calc()
            {
              res=a+b;
             
           }
         }
         class D2 extends D1
         {
            public void display()
            {
            
              System.out.println("The output is"+res);
           }
         }
         public class InheriDemo2
         {
             public static void main(String args[])
             {
               D2 obj=new D2();
               obj.inputData();
               obj.calc();
               obj.display();
             }
         }
   