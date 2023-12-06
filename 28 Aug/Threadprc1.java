/**
 * Threadprc
 */

class Thread1 extends Thread{
   
 
    public void run() {
    //     int i=10;
    //     while(i<20){
    //     System.out.println("Im Thread 1");
    //     try{
    //         Thread.sleep(455);
            
    //     }
    //     catch(InterruptedException e){
    //         e.printStackTrace(null);
    //     }
    //     i++;
    // }
    

    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("im Thread  2");
        System.out.println("im Thread  2");
        System.out.println("im Thread  2");
        System.out.println("im Thread  2");
        System.out.println("im Thread  im specil");
        
    }
}

public class Threadprc1 {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread1 t3=new Thread1();
        // t3.setPriority(Thread.MAX_PRIORITY);
        // try{
        //     t1.join();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        t2.start();
      
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());
        t3.start();
    }
}

