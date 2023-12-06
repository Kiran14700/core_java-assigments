// class YoungerAGEXception extends Exception{     //if we only put Exception then it becomes compile time exception

import java.util.Scanner;

class YoungerAgeXception extends RuntimeException // our class name is our exception
{
    YoungerAgeXception(String msg) {
        super(msg); // by super keyword we call parent clss
    }

}

// public class ExceptionThrow1 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter Your age:");
// int age = sc.nextInt();
// if (age < 18) {
// throw new YoungerAgeXception("You are not eligible for vote"); // by the help
// of thorw keyword we create our
// // ownException
// // System.out.println("Heello"); // if we write anything after throw then
// error appears we cant write anything

// } else {
// System.out.println("You are eligible");
// }
// }
// }

// we can handle throw exception throught try catch
public class ExceptionThrow1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age:");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new YoungerAgeXception("You are not eligible for vote"); // by the help of thorw keyword we create
                                                                               // our
                                                                               // ownException
                // System.out.println("Heello"); // if we write anything after throw then error
                // appears we cant write anything

            } else {
                System.out.println("You are eligible");
            }
        } catch (Exception e)     //by help of catch we handle exception given by User(me
        )
         {
            // e.printStackTrace();
            System.out.println("You are not eligble");
        }
        System.out.println("Hello");
    }
}
