
/**
 * Daemon_thread
 */

 /**
  
  */
  
 class Test extends Thread {
    // public void run() {
    //     if(Thread.currentThread().isDaemon())
    //     {
    //     System.out.println("Daemon");
    //     }
    //     else{
    //     System.out.println("Child Thread");
    //     }
    // }

    public void run(){
        System.out.println("Child old priority"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(50000);

        System.out.println("child.new priority"+Thread.currentThread().getPriority());
    }
 }
 public class Daemon_thread {
 

    public static void main(String[] args) {
        // //if we not print anything  then daemon thread cant wokr because daemon thread is an helper of main thread
        // System.out.println("Main Thread");

        // Daemon_thread dt = new Daemon_thread();
        // dt.setDaemon(true);
        // dt.start();
        System.out.println("old parent priority:"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);

        System.out.println("new parent priority :"+Thread.currentThread().getPriority());
        Test Prior=new Test();
        Prior.start();
    }
}

