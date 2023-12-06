//  class praacOOPs
//  {
//     String color;
//     int age;
// public void eat(){
//     System.out.println("I am eating");
// }
// public void run(){
//     System.out.println("I am Running");
// }
// public void black(){
//     System.out.println("Im "+color+"In color");
// }
// public void ag(){
//     System.out.println("My age is : "+age);
// }



//  // but we only make an one main string class

//     public static void main(String[] args) {
//         System.out.println("Im an main class");  //first this will run it will print orderly
//         praacOOPs obj=new praacOOPs();
//         obj.run();
//         obj.eat();

//         //by using obj we can directly put values in variables  .. called instilining variables
//         obj.color="Black";
//         obj.age=14;
//         System.out.println("-----------------");

//         obj.black();
//         obj.ag();

//         //you can run obj muktiple times
//         obj.run();
//         obj.bark();
//         //if you want to print it on main column then you should first right obj then variable name

//         System.out.println("obj color and age :L"+obj.color+" "+obj.age);
        
//         //make an new class object

//         Birds sp=new Birds();
//         sp.fly();
//         sp.display();
//     }


//     //you can create emthod anywhere

//     //like

//      public void bark(){
//         System.out.println("I m barking");
//      }

// }

//only if you make an anotheir class then u shoudl make an new class object
class praacOOPs {
String color2;
int age2;

        //second by method
    void intg(String color2,int age2){

        //by using word this you can give same names,it cant give erro whenerver is the nemae
     this. color2=color2;
        this.age2=age2;
        System.out.println("I m flying");
      

    }
    void display(){
        System.out.println(color2);
        System.out.println(age2);
    }
    public static void main(String[] args) {
        praacOOPs obj=new praacOOPs();
      
        obj.intg("white",18);
        obj.display();
        
    }
}