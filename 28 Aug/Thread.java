import java.util.Scanner;


class PosNeg extends Thread {
    public void run() {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int i=sc.nextInt();
        if (i > 0) {
            System.out.println("The number is Positive");
        }
        else{
            System.out.println("The number is Negative");
        }
    }
}

public class Thread{
    public static void main(String[] args) {
        
        PosNeg obj1 = new PosNeg();       
        obj1.start();
    }
}
