import java.util.Scanner;
class Oop2
    {
            double length,breadth,radius,side,c;         //variaables,fields,properties
            public void input()      
             {
              Scanner sc=new Scanner(System.in);
              
              System.out.println("Enter the Length");
              
              length=sc.nextDouble();
              System.out.println("Enter the Breadth");
              breadth=sc.nextDouble();
              System.out.println("Enter the radius");
              radius=sc.nextDouble();
              System.out.println("Enter the side");
              side=sc.nextDouble();
             }
             
            public void areaofrectangle()        
               { 
                  c=length*breadth;
                  System.out.println("The area of rectangle" +c);
                  
               }
            public void areaofside()        
               { 
                 
                 c=side*side;
                 System.out.println("The area of square" +c);
                  
               }
             public void areaofcircle()        
               { 
                 
                 c=3.14*(radius*radius);
                 System.out.println("The area of circle" +c);
                  
               }
         
          }

          public class Main1
          {
             public static void main(String args[])
               {
                 Oop2 obj=new Oop2();   //object creation
                 obj.input();
                 obj.areaofrectangle();
                 obj.areaofside();
                 obj.areaofcircle();
                 
               }
         }