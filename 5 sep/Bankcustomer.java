import java.util.Scanner;

public class Bankcustomer {
    private int acno;
    private String atype;
    private int amt;
    private String acname;

    Bankcustomer(int acno, String acname, String atype, int amt) {
        this.acno = acno;
        this.acname = acname;
        this.atype = atype;
        this.amt = amt;

    }

    public void Display() {
        System.out.println("Your account number: " + acno);
        System.out.println("Your account name: " + acname);
        System.out.println("Account type:" + atype);
        System.out.println("current amount:" + amt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the accout number");
        int acno = sc.nextInt();
        Bankcustomer obj = new Bankcustomer(acno, "Kiran", "Saving", 50000);
        obj.Display();
    }
}