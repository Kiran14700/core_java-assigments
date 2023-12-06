 class Shape
{
    double length;
    double breadth;
    double radius;
  
    Shape()
    {
        this.length = 15.5;
        this.breadth = 10.67;
        this.radius =20.14;
    }
}
    class Rectangle extends Shape
    {
       public void Rectarea()
       {        
       System.out.println("The area of rectangle is:"+(length*breadth));        
       }
    }
      class circle extends Shape
    {
       public void Circlearea()
       {        
       System.out.println("The area of circle is:"+(Math.PI*radius*radius));
       }
    }

public class Shape_Main {
    public static void main(String[] args) {
         Rectangle rect=new Rectangle();
         rect.Rectarea();
         circle c = new circle();
         c.Circlearea();
        
       }
    }