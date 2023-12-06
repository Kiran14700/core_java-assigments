class Vehicle
{
        void engine()
         {
                 System.out.println("This is a engine for vehicles");
         }
}
class Bike extends Vehicle
{
        @Override
        void engine()
       
         {
                 super.engine();
                 System.out.println("This is a engine for Bike");
         }
}
class Car extends Vehicle
{
        @Override
        void engine()
        
        
         {
                 super.engine();
                 System.out.println("This is a engine for Car");
         }
}

public class Overriding2
{
       public static void main(String args[])
       {
                Car obj=new Car();
                
                obj.engine();
                
       }
}