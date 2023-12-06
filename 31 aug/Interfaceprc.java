//its compile 

// interface Interfaceprc{
//     void  show();
// }



 // interface Interfaceprc{
//     abstract void  show();
// }

// if we use anything other than pucblic modifer then it shows error
 // public interface Interfaceprc{
//     abstract void  show();
// }


//abstact cannot have body but if use default,static modifer in interface class it accept
// interface Interfaceprc{
//     void show();
//     default void display(){
//         System.out.println(1);
//     }

//     }
// interface Interfaceprc{
//     void show();
//     static void display(){
//         System.out.println("1");
//     }
// }


/**
 * Interfaceprc
 */
 interface Li1 {


   //here public word is automaticlly run by java 
   //apne aap laga jataah ha java ma


    void show();

}

//java  not support multiple inheritance but we can achieve it through interface

interface li2{
    void display();
}
    class Interfaceprc implements Li1,li2{

        //if we cannot use public modifier then it show error
       public void show(){
            System.out.println("L");
        }

        //body of display method
        public void display(){
            System.out.println("BOdy of display");

        }
        public static void main(String[] args) {
            //we cant mak obj of main interface class
            Interfaceprc obj=new Interfaceprc();
            obj.show();
            obj.display();  
            
        }
    }
 


