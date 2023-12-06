import java.util.Scanner;
class BasicCalc
{
 public static void main(String args[])
 {
 Double a,b;
 int ch;
 Scanner sc=new Scanner(System.in);
System.out.println("Tell the operator you want 1.addition,2.Subtraction,3.Multiplication,4.Division");
  ch=sc.nextInt();
 

 switch(ch)
 {
 case 1:
       System.out.println("Enter first number ");
       a=sc.nextDouble();
       System.out.println("Enter second number ");
       b=sc.nextDouble();
       System.out.println("Additon"+(a+b));
       break;
 case 2:
       System.out.println("Enter first number ");
       a=sc.nextDouble();
       System.out.println("Enter second number ");
       b=sc.nextDouble();
       System.out.println("Subtraction"+(a-b));
       break;
 case 3:
       System.out.println("Enter first number ");
       a=sc.nextDouble();
       System.out.println("Enter second number ");
       b=sc.nextDouble();
       System.out.println("Multiplication"+(a*b));
       break;
 case 4:
       System.out.println("Enter first number ");
       a=sc.nextDouble();
       System.out.println("Enter second number ");
       b=sc.nextDouble();
       System.out.println("Division"+(a/b));
       break;

 default:
       System.out.println("This case is invalid");
       break;
}
}
}