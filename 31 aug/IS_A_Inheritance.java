
// //Types of inheritance
// import java.util.Scanner;

// // Single inheitance
// class A {    
//     String name;
//     void Accept() {
//      System.out.println("Name of the employee");

//     }
// }

// class B extends A {
//      int i;
//     void Id(){

//         System.out.println("Id of the employee");

//     }

// }
// //Multi level inheritance

// class IS_A_Inheritance extends B{
//     void Display(){
//         System.out.println("Accept");
//         System.out.println("Display");
//     }

//     public static void main(String[] args) {

//         IS_A_Inheritance obj=new IS_A_Inheritance();

//         obj.Accept();
//         obj.Id();
//         obj.Display();
//         System.out.println();

//     }

// }

//heirarchical inheritance

// import java.util.Scanner;

// class A {
//   
//     
//     void ShowA() {
//         System.out.println("I'm from class A");
//       
//     }
// }

// class B extends A {
//     void ShowB() {
//         System.out.println("I'm from class B");
//     }
// }

// class C extends A {
//     void ShowC() {
//         System.out.println("I'm from class C");
//     }
// }

// class IS_A_Inheritance {
//     public static void main(String[] args) {

//         // i can call Object A simply
//         A obj1 = new A();
//         obj1.ShowA();
//         System.out.println("------------------");

//         // From obj of class B i can only call B himself and Class A
//         B obj2 = new B();
//         obj2.ShowA();
//         obj2.ShowB();

//         System.out.println("-------------------");
//         // From obj of class C i can only call C himself and Class A

//         C obj3 = new C();
//         obj3.ShowA();
//         obj3.ShowC();
//         // obj.Showc();//it doest'nt call class C because B is not inherit with class C

//     }
// }

import java.util.Scanner;

class A {
    Scanner sc= new Scanner(System.in);
    String n;
    int id;
    void ShowA() {
        System.out.println("Enter the name");
        n=sc.next();
        System.out.println("Enter the id");
        id=sc.nextInt();
    }
}

class B extends A {
    void ShowB() {
        System.out.println(n);
    }
}

class C extends B {
    void ShowC() {
        System.out.println(id);
    }
}

class IS_A_Inheritance {
    public static void main(String[] args) {
        C obj=new C();
        obj.ShowA();
        obj.ShowB();
        obj.ShowC();


    }
}
