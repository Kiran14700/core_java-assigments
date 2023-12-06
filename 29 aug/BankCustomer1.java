import java.util.Scanner;

public class BankCustomer1{
    int acno;
    String atype;
      int amt;

    public BankCustomer1(int acno,String atype, int amt){
        this.acno=acno;
        this.atype=atype;
        this.amt=amt;
    }
    void Display() {
        System.out.println("Sir your account Name:" +acno);
        System.out.println("Sir your account Type:"+atype);
        System.out.println("Sir your account Balance:"+amt+"Rs");
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your Account number");
        int acno=sc.nextInt();
        System.out.println("Enter your Account type");
        String atype=sc.next();
        System.out.println("Enter your Account balance");
        int amt=sc.nextInt();

        BankCustomer1 obj=new BankCustomer1(acno, atype ,amt);
        obj.Display();

        
    }
}