
import java.util.Scanner; //Scanner object is imported

class Xavier {
    public static void main(String args[]) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of English:");
        a = sc.nextInt();
        System.out.println("Enter the Marks of Maths:");
        b = sc.nextInt();
        System.out.println("Enter the Marks of Science:");
        c = sc.nextInt();

        // logics for the given conditions

        if (a >= 80 && b >= 80 && c >= 80) // used AND operation this returns boolean expression i.e True or false
        {
            System.out.println("You are eligble for Pure science");
        } else if (a >= 80 && c >= 80 && b >= 60)

        {
            System.out.println("You are eligble for Bio science");
        } else if (a >= 60 && b >= 60 && c >= 60)

        {
            System.out.println("You are eligble for Commerce");
        } else {
            System.out.println("Your not eligible for admission");

        }

    }
}
