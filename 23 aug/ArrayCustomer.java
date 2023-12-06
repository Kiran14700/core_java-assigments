import java.util.*;

/**
 * ArrayCustomer
 */
public class ArrayCustomer {

    public static void main(String[] args) {

        String[] name = new String[3];
        int[] FLat_no = new int[3];
        String Parking[] = new String[3];
        boolean Park=false;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 2; i++) {
            System.out.println("Enter the name of the customer");
            name[i] = sc.next();
            System.out.println("Enter the Flat number of the customer");
            FLat_no[i] = sc.nextInt();
            System.out.println(
                    "Sir if you want permanent parking you need to pay 2 lakh Rs extra \n If you want Parking type yes or didn't want type no");
            Parking[i] = sc.next();
     
            
            switch (Parking[i]) {
                case "yes":
                    System.out.println("Sir your name is: " + name[i]);
                    System.out.println("Your Flat number: " + FLat_no[i]);
                    System.out.println("Your Parking is allocated sir ");
                    break;
                default:
                    System.out.println("Sir your name is: " + name[i]);
                    System.out.println("Your Flat number: " + FLat_no[i]);
                    System.out.println("Parking is not allocated to you sir,because you not pay parking charges ");
                    break;

            }

        }
    }
}

