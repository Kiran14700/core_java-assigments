//Write a JAVA program which will generate the threads: 

//- To display 10 terms of Fibonacci series. -
//0 1 1 2 3 5 8 13 21

class Fibonacci extends Thread // declared class which extends Thread
{
    public void run() // declared method to run thread
    {
        int input = 10; // declared variables
        int sum;
        int rem;
        int a = 0, b = 1;
        a = 0;
        b = 1;
        // we already inserted value of a and b thatswhy we print them first
        System.out.println(a + " ");
        System.out.println(b + " ");

       
                   //fibonacci operation 
        for (int i = 3; i <= input; i++) {
            sum = a + b;
            a = b;
            b = sum;

            System.out.println(sum);
        }

    }
}

// To display 1 to 10 order in reverse

class reverse extends Thread {
    public void run() {   //reverse the order of 1 to 10 operation

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

    }
}

public class FibonacciThreads {
    public static void main(String[] args) {

        Fibonacci obj = new Fibonacci();
        System.out.println("Fibonacci Series");
        obj.start(); // by using start() method we run the thread

        try { 
            obj.join();                                // we using join method to display fiboncacci series first then reverse order

        } catch (Exception e) {
            System.out.println(e);
        }
        reverse rev = new reverse();
        System.out.println("Reverse order");
        rev.start();

    }
}
