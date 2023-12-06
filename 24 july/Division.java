
import java.util.Scanner; //Scanner object is imported
class Division
 {
 public static void main(String args[])
 {
 int a;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number:");
 a=sc.nextInt();



 //logics for the given conditions

 if(a%5==0 && a%11==0) 
 {
  
 System.out.print("The number is divisible");
 }

 else 
 {
 System.out.print("The number is not divisble by both");
 }
 sc.close();
 }
}


