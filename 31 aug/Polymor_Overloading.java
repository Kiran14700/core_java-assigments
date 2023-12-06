// //Examples of method overloading

// class Test {

//     //Argyments must be different in overloading
//     // void Show(int a) {
//     //     System.out.println("Method integer" + a);

//     // }

  

//     // void Show(String s, int n) {
//     //     System.out.println("Method String and integer" + s+" "+n);
//     // }

//     // void Show() {
//     //     System.out.println("Method empty");
//     // }
    
// //Automatic promotion
// //it means agar obj ko uska String ya int nahi miltah toh woh uska  //Automatic promotion fir krdeta hai

// //suppose
// //we can write object method directly
//   void Show(Object s){
//     System.out.println("Object method");

//   }
//     // void Show(String s) {
//     //     System.out.println("Method String" + s);
//     // }

// }

// public class Polymor_Overloading {
//     public static void main(String[] args) {
//         Test obj=new Test();
//         // obj.Show(5);
//         // obj.Show("Kiran");
//         // obj.Show("Kiran",10);
//         // obj.Show();
//         obj.Show("s");  //its an char type so it returns int accorind g to the automatic propmotion  
//         //seee the ouput it return in tvalue
        

//     }
// }


// class Test{
//     void Show(String s){
//         System.out.println("I m  String");
//     }
//     void Show(StringBuffer s){
//         System.out.println("I m String buffer");
//     } 
 
// }
// public class Polymor_Overloading {

// public static void main(String[] args) {
//     Test obj=new Test();
//     obj.Show("abc"); // Both are String but it call String
//     obj.Show(new StringBuffer("xyz"));   //it will call both strings
//     obj.Show(null);        // its an ambiguous error  compiler becomes confuse
// }
// }


// //byte ->short->int->long->double
// //int->float or long or double
// //char->int
// //long->double or float
// //float->double
// class Test{
//     void Show(int a,float b){
//         System.out.println("Int float method");
//     }
//     void Show(float b,int a){
//         System.out.println("I m String buffer");
//     } 
 
// }
// public class Polymor_Overloading {

// public static void main(String[] args) {
//     Test obj=new Test();
//     obj.Show(10,20.5f); // Simply it will call int float method
//     obj.Show(15.f,20);   // if float is first then it will call both
//     obj.show(20,20);// if both are integers it will provide mbigious error compiler becomes confuse
// }
// }


class Test{
    // void Show(int a,float b){
    //     System.out.println("Int float method");
    // }
    // void Show(float b,int a){
    //     System.out.println("I m String buffer");
    // } 

    // //if its strng then it will run it will utomticlllly  chnge float to int
    // void Show(String a,float b){
    //     System.out.println();
    // }

    //Var args

    void Show(int a){
        System.out.println("Normal integers");
    }

    void Show(int... a){
        System.out.println("Variable arguments");

    }

 
}
public class Polymor_Overloading {

public static void main(String[] args) {
    Test obj=new Test();
    // obj.Show(10,20.5f); // Simply it will call int float method
    // obj.Show(15.f,20);   // if float is first then it will call both
    // // obj.show(20,20);// if both are integers it will provide mbigious error compiler becomes confuse
    // obj.Show("Xy", 20);  //then it will first run other method then it will run himself
    // obj.show(10,20,30); // it will run varargs method
    
    obj.show();    //it will run var args because varargs have opportuit ot run even method r empty

    
}
}




