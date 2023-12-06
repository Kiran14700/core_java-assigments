import java.util.Scanner;
class Oop1
    {
            double a,b,c;         //variaables,fields,properties
            public void input()      
             {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the numbers");
              a=sc.nextDouble();
              b=sc.nextDouble();
             }
            public void addNum()        
               { 
                 c=a+b;
                 System.out.println("The addition of" +a+"and" +b+ "is" +c);
                  
               }
            public void subNum()        
               { 
                 c=a-b;
                 System.out.println("The subtraction of" +a+"and" +b+ "is" +c);
                  
               }
             public void mulNum()        
               { 
                 c=a*b;
                 System.out.println("The multiplication of" +a+"and" +b+ "is" +c);
                  
               }
             public void divNum()        
               { 
                 c=a/b;
                 System.out.println("The division of" +a+"and" +b+ "is" +c);
                  
               }
          }

          public class Main
          {
             public static void man(String args[])
               {
                 Main Oop1=new Oop1();   //object creation
                 obj.input();
                 obj.addNum();
                 obj.subNum();
                 obj.mulNum();
                 obj.divNum();
               }
         }