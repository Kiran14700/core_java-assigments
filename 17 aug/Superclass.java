
class Shape
    {
      class Triangle extends Shape
       {
         public void Angles()
         System.out.println("The Area of a triangle:");
       }
      
      class Square extends Shape
       {
         @Override
         public void Angles()
         
         System.out.println("The Area of a triangle:");
       }
      class Circle extends Shape
       {
         @Override
         public void Angles()
         
         System.out.println("The Area of a triangle:");
       }
    }
public class Superclass
     {
       public static void main(String []args)
         {
           Circle obj=new Circle();
           obj.Angles();
           
          }
      }
           
  
    