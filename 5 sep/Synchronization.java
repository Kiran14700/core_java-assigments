class Table {
    synchronized void printTable(int n)// method not synchronied
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}

class MyThread1 extends Thread {
  public   Table t;            //constructor
    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
   public  Table t;            //constructor

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(25);
    }
}

public class Synchronization {
    public static void main(String[] args) {
        Table obj = new Table();// only one object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();

    }
}