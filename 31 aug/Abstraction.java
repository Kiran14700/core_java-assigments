/**
 * Abstraction
 */
//class must be abstact otherwise it show error
abstract class Abstraction //Vehicle
{
    abstract void start();
}
class Car extends Abstraction{
    //its an body of abstract class we doesnt write snything it will show error
    void start(){
        System.out.println("Car starts with key");

    }
class Scooter extends Abstraction{
    void start(){
         System.out.println("Scooter starts with key");
        
    }
    public static void main(String[] args) {

        //we cant make object of parentabstact class
       Car c=new Car();
        c.start();
       Scooter s=new Scooter();
        s.start();
        
    }
}
    
}