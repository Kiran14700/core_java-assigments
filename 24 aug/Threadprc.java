/**
 * Threadprc
 */

class Thread1 implements Runnable{
    public void run() {
        System.out.println("Im Thread 1");
        System.out.println("Im Thread 1");
        System.out.println("Im Thread 1");
        System.out.println("Im Thread 1");
        System.out.println("Im Thread 1");
        System.out.println("Im Thread 1");
        System.out.println("Im Thread 1");
        System.out.println("Im Thread 1");
        System.out.println("Im Thread 1");
        System.out.println("Im Thread 1");
        System.out.println("Im Thread 1");
        System.out.println("Im Thread 1");

    }
}

class Thread2 implements Runnable {
    public void run() {
        System.out.println("im Thread  2");
        System.out.println("im Thread  2");
        System.out.println("im Thread  2");
        System.out.println("im Thread  2");
        System.out.println("im Thread  im specil");
        
    }
}

public class Threadprc {
    public static void main(String[] args) {
        Thread1 bullet1 = new Thread1();
        Thread gun1 = new Thread(bullet1);
        

        Thread2 bullet2 = new Thread2();
        Thread gun2 = new Thread(bullet2);

        Thread2 bullet3 = new Thread2();
        Thread gun3 = new Thread(bullet3); 
        gun3.setPriority(Thread.MAX_PRIORITY); 

        gun1.start();
        gun2.start();
        gun3.start();

    }
}

