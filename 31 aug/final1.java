// public class final1 {
//     public static void main(String[] args) {
//        final int i=10; //if i want to make i value constant(means not change) then i use  final keyword
//     }
    
// }
/**
 * final1
 */


 //2 method of if we dont want to use override 
//  class Over1{
//     void Over2()   //if i use final word  in method then its method value becomes constant  and it not be use in anotheir method
//     {
//         System.out.println("A");
//     }
 
//  }
// public class final1 extends Over1{
//     void Over2(){
//         System.out.println("B");
//     }

//     public static void main(String[] args) {
        
//     }
// }



//3 method 
 class Demo        //if i not want to inherit parent class then i use final keyword
{
    void DemoM(){
        System.out.println("Demo");


    }


}
class Demo2 extends Demo{
    void DemoM2(){
        System.out.println("Demo2");

    }

}

 
public class final1 extends Demo2 {

    
}
