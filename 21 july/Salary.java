
import java.util.Scanner; //Scanner object is imported

class Salary {
    public static void main(String args[]) {50
        int Sal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary:");
        Sal = sc.nextInt();

        // logics for the given conditions

        if (Sal >= 50000 && Sal < 75000) // used AND operation this returns boolean expression i.e True or false
        {
            System.out.println("I am happy");
        } else if (Sal >= 75000 && Sal < 100000) {
            System.out.println("I have a better life");
        } else if (Sal >= 100000) {
            System.out.println("My family is happy with my salary");
        } else {
            System.out.println("My family is unhappy with my salary,they will tell me dont come home ");

        }
    }
}