import java.util.Scanner;

public class Showroom {
    String name;
    long mobile_no;
    double cost, amount, dis;
    Scanner sc = new Scanner(System.in);

    void input() {

        System.out.println("Enter the name of the customer");
        // name = sc.next();
        System.out.println("Enter the mobile number of the customer");
        // mobile_no = sc.nextLong();
        System.out.println("Enter the cost of the customer");
        // cost = sc.nextDouble();
    }

    void calcuate() {
        if (cost <= 10000) {
            dis = (cost / 100) * 5;
            amount = cost - dis;

        } else if (cost >= 10000 && cost <= 20000) {
            dis = (cost / 100) * 10;
            amount = cost - dis;

        } else if (cost >= 20000 && cost <= 35000) {
            dis = (cost / 100) * 15;
            amount = cost - dis;

        } else if (cost == 35000) {
            dis = (cost / 100) * 20;
            amount = cost - dis;
        }
    }

    void display() {
        System.out.println("Name of the customer" + name);
        System.out.println("Mobile number of the customer" + mobile_no);
        System.out.println("Customer got discount of" + dis + "in the amount of" + cost);
        System.out.println("customer should pay" + amount + "Rs");

    }

    public static void main(String[] args) {

        Showroom obj = new Showroom();
        obj.name = "Kiran";
        obj.mobile_no = 877908486;
        obj.amount = 10000;
        obj.input();
        obj.calcuate();
        obj.display();

    }

}
