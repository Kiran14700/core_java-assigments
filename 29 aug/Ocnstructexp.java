// class Employee1{
// //     private int id,salary;
// //     private String name ;
// //     // public Employee1(){
// //     //     name="Kirn";
// //     //     id=50;      
// //     // }
// //     public Employee1(){
// //         name="Kiran";
// //         id=51;
// //         salary=52000;   
// //     }
// //     public String getName(){
// //         return name;
// //     }
// //     public int getId(){
// //         return id;
// // }
// //     public int getSalary(){
// //     return salary;
// // }

// }  



/* 
class Rectangle{
    

    Rectangle(){


        System.out.println("Imn bse constructor");
    //  length=14;
    //  breadth=15;
    }
    Rectangle(int x){
        System.out.println("I m n overloded constructor with the vlue of a"+x);
    }

 


}
class square extends Rectangle{
    square(){
    System.out.println("im n derived constructor");
    }
    square(int x ,int y){
            super(x);

                   System.out.println("I m n overloded constructor with the vlue of y"+y);
    }
    
    }
class childclass extends square{
    childclass(){
    System.out.println("im n childcls  constructor");
    }
    childclass(int x ,int y,int z){
            super(x,y);

                   System.out.println("I m n overloded constructor with the vlue of z"+z);
    }
    
    }
class grndchildclass extends childclass{
    grndcchildclass(){
    System.out.println("im n childcls  constructor");
    }
    grndchildclass(int x ,int y,int z,int b){
            super(x,y,z);

                   System.out.println("I m n overloded constructor with the vlue of z"+b);
    }
    
    }

    */


    //This and super key
    class Ekclass{
        int a;

        public int getA(){
            return a;
        }
         Ekclass(int a){
            this.a=a;
        }
            public int returname(){
                return 1;
            }

        }
    


        

public class Ocnstructexp {
    public static void main(String[] args) {

    //  square obj=new square(14,9);
    // childclass obj =new childclass();
    // childclass obj =new childclass(14,7,9);
    // grndchildclass obj=new grndchildclass(58,75 , 40,45 );

    Ekclass obj=new Ekclass(540);
    
    System.out.println(obj.getA());
 
 

    //  System.out.println("Area of rectangle"+obj.getSum());

        // Employee1 obj=new Employee1();     
        // System.out.println("Your name       :"+obj.getName());
        // System.out.println("Your id         :"+obj.getId());
        // System.out.println("Your salary is  :"+obj.getSalary());
    }   
}


