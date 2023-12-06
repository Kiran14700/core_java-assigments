//Write a Java program to create multiple thread in Java. Apply thread properties too.(priority, name)

class A extends Thread{                  //class name declared and extend with Thread
    public void run(){
        for(int i=1;i<10;i++){
            System.out.println("I'm a superior Thread");
        }
    }   
}
class B extends Thread{                  //class name declared and extend with Thread

    public void run(){
        for(int i=1;i<10;i++){
            System.out.println("I'm a Normal Thread");
        }
    }   
}
class C extends Thread{                   //class name declared and extend with Thread

    public void run(){
        for(int i=1;i<10;i++){
            System.out.println("I'm a Weaker Thread");
        }
    }   
}

public class MultipleThread {
    public static void main(String[] args) {
        A obj1=new A();         //Threads declared
        B obj2=new B();
        C obj3=new C();
        
        obj1.setPriority(Thread.MAX_PRIORITY);         //by using this method we maximie the priority of thread,this will firstly run because its an max prirority
        obj2.setPriority(Thread.NORM_PRIORITY);       //by using this method thread run in the normal priority its between max and min priority
        obj3.setPriority(Thread.MIN_PRIORITY);        //by using this method we minimie the priority of thread,this will lstly run because its an min prirority
 
        obj1.start();            //Thread running executed
        obj2.start();
        obj3.start();
        
    }
}
