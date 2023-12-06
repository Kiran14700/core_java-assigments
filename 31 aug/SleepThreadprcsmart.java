//First method of sleep in nomrmal class
// public class SleepThreadprcsmart {
//     public static void main(String[] args) throws Exception{
//             for(int i=1;i<=5;i++){
//            Thread.sleep(1000);
//            System.out.println(i);
//         }

//     }

// }

/**
 * // * SleepThreadprcsmart
 * //
 */
// public class SleepThreadprcsmart {

// public static void main(String[] args) {
// for(int i=1;i<=5;i++){
// try{
// Thread.sleep(500,i);
// System.out.println(i);
// }
// catch(Exception e){
// System.out.println(e);
// }
// }
// }
// }

// public class SleepThreadprcsmart extends Thread {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             try 
//             {
//             Thread.sleep(1000);
//             } 
//             catch (Exception e)
//             {
//                 System.out.println(e);
//             }
//             System.out.println(i);
//         }
//     }

//     public static void main(String[] args) {
//          SleepThreadprcsmart obj = new SleepThreadprcsmart();
//         obj.start();
//     }
// }

// class test extends Thread{
//     public void run(){
//         try{
//             for(int i=1;i<=5;i++)
//             {
//                 Thread.sleep(1000);
//                 System.out.println(i+":"+Thread.currentThread().getName());
//             }           
//             }
//             catch(Exception e){
//                 System.out.println(e);
//             }
//         }
//     }
// /**
//  * SleepThreadprcsmart
//  */
// public class SleepThreadprcsmart {

//     public static void main(String[] args) {
//         test obj=new test();
//         obj.start();
//     }
// }

// class test extends Thread{
//       public void run(){

//     for(int i=1;i<=5;i++);
//     {
//         System.out.println(" normal:"+Thread.currentThread().getName()+" ");
//     }
//   }
// }

//  public class SleepThreadprcsmart {

//     public static void main(String[] args) {
//         test obj=new test();
//         obj.start();
//         Thread.yield();
//         System.out.println("Main"+Thread.currentThread().getName());

//     }
//  }

//join class

/**
 * SleepThreadprcsmart
 */
class test extends Thread
{
    public void run()
     {
        try
        {         
        for (int i = 1; i <= 5; i++)
         {
            Thread.sleep(1000);
            System.out.println(i + "child");
        }
        catch(Exception e){
        System.out.println(e);
        }
    
    }
}
}
    public class SleepThreadprcsmart {


//if we on main method we use throws exception but not on any other method
        public static void main(String[] args) throws InterruptedException {
        test obj=new test();
        obj.start();
        obj.join();
        try{
            for(int i=1;i<5;i++){
            Thread.sleep(1000);
            System.out.println(i);
            }

    }
            
        catch(Exception e){
        System.out.println(e);
        }


        
    }
}
