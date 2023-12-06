
public class Area
{
     int rectangle(int length, int breadth)
     {
          return length*breadth;
     }
     int square(int side)
     {
          return side*side;
     }
     double circle(double pie,double radius)
     {
          return pie*(radius*radius);
     }
     public static void main(String args[])
     {
         Area obj=new Area();
         //this will call the area of rectangle method
         System.out.println("Area of rectangle: "+obj.rectangle(10, 20));
         //this will call the area of square method
         System.out.println("Area of square: "+obj.square(10));
         //this will call the area of circle method
         System.out.println("Area of circle: "+obj.circle(3.14,20.0));
        }
    }