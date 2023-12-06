// import java.io.EOFException;

// public class InterrupteddemoThread  extends Thread{
//     public void run(){
//         try{
//             for(int i=1;i<=5;i++){
//                 System.out.println(i);

//                 // if we commnd sleep method then interrupt act like n normal thread
//                 Thread.sleep(1000);

//             }

//         }
//         catch(Exception e)
//         {
//             System.out.println("Thread interrupted"+e);
//         }
//     }
//     public static void main(String[] args) {
//         InterrupteddemoThread obj=new InterrupteddemoThread();
//         obj.start(); 
//     // inteerupt return interrupted exception it use in sleep and wait methods
    
//     obj.interrupt();
        
//     }
    
// }



//isinteerupted or interruptesd


import java.io.EOFException;

public class InterrupteddemoThread  extends Thread{
    public void run(){

        //it displays the boolean value telling that inteerupt is activate and make the interrupted false so that Thread sleep method can runt without getting a error
        // System.out.println("A1: "+Thread.interrupted());
        // System.out.println("A2: "+Thread.interrupted());


        System.out.println(Thread.interrupted());  //if we use interrupted method then its change the boolean value thatswhy is|Interrupted method becomes false    //true -> false
        System.out.println("B1"+Thread.currentThread().isInterrupted());   // it return the true state value ,its not lke interrupted  //true -> false
        // System.out.println("B2"+Thread.currentThread().isInterrupted());   // it return the true state value ,its not lke interrupted,but we use it twice its condtion becomes true
    
        // System.out.println(Thread.currentThread().isInterrupted());

        // if we use Thread.interrupted twic it change the boolean value every time when it executes
        try{
            for(int i=1;i<=5;i++){
                System.out.println(i);

                // if we commnd sleep method then interrupt act like n normal thread
                Thread.sleep(1000);

            }

        }
        catch(Exception e)
        {
            System.out.println("Thread interrupted"+e);
        }
    }
    public static void main(String[] args) {
        InterrupteddemoThread obj=new InterrupteddemoThread();
        obj.start(); 
    // inteerupt return interrupted exception it use in sleep and wait methods
    
    obj.interrupt();

        
    }
    
}
