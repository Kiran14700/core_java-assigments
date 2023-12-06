// class Employee{
//    double salary;
//     String name;
//     public double getSalary(){
//         return salary;
//     }
//     public void setSalary(double f){
//         salary=f;

//     }
//     public String getName(){
//         return name;
//     }
//     public void setName(String n){
//          name=n;
//     }
// }


// class cellphone{



//     public void Ringing(){
//         System.out.println(".....ringign");
//     }
//     public void singing(){
//         System.out.println(".....ringign");
//     }
//     public void Vibrating(){
//         System.out.println(".....ringign");
//     }
        
//     }

import java.util.Scanner;

class Squ{
    
    int side;
   
    
    public int sidee(){
          
        return side*side;
    }
    public int perimter(){
        return 4*side;
    }
}



public class prc {
        public static void main(String[] args) {
   
     
        Squ obj=new Squ();
      obj.side= 4;
       
        System.out.println(obj.sidee());
        System.out.println(obj.perimter());
      
       
      
     

        //     cellphone obj=new cellphone();
        //    obj.Ringing();
        //    obj.Vibrating();
        //    obj.singing();
            // System.out.println(obj.getName());
            // System.out.println(obj1.getName());
            // obj.setSalary(5000.0);
            // System.out.println("Your Srly"+obj.getSalary());
        }  
}
