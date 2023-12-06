import java.util.Scanner;

public class EmpSalaryCasting {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int sal;

        System.out.println("Enter your salary: ");
        sal=sc.nextInt();

        double finalsal=(double) sal;
        finalsal=finalsal+((sal/100)*11);
        System.out.println("Salary with 11% bonus: "+finalsal);

    }
    
}
