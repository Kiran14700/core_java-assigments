/**
 * InnerUsingThread
 */
class Myth1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 1 is running");
        System.out.println("I am sad");

    }

}

class Myth2 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread 2 is running");
        System.out.println("I am Happy");

    }

    
}

public class UsingThread {
    public static void main(String[] args) {
        Myth1 m1 = new Myth1();
        try {
            m1.join();

        } catch (Exception e) {
            System.out.println(e);

        }
        Myth2 m2 = new Myth2();
        m1.start();
    }

}