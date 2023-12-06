class Rectangle1
{
    double length;
    double breadth;
   
    Rectangle1()
    {
        length = 15.5;
        breadth = 10.67;
    }
    void calculateArea()
    {
       System.out.println(length*breadth);
       // return length*breadth;
       }
 }

class Rectangle_Main {
    public static void main(String[] args) {
         double area;
         Rectangle1 myrec = new Rectangle1();
         myrec.calculateArea();
         //System.out.println("The area of the Rectangle: "+area);
       }
    }