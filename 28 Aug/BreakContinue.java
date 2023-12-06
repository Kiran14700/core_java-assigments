import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {

        int num;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        for (int i = 1; i <= 10; i++) {
            num = sc.nextInt();

            if (num < 0) {
                continue;
            }
            if (num % 2 == 0) {

                sum = sum + num;
            }
        }
        System.out.println("Sum" + sum);

    }

}
