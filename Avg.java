// program to Calculate average of three numbers
import java.util.Scanner;

class Avg
{


public static void main(String args[])
{
Double a,b,c;
Double res;
Scanner sc=new Scanner(System.in);
System.out.println("Enter First number");
a=sc.nextDouble();

System.out.println("Enter Second number");


b=sc.nextDouble();
System.out.println("Enter Third number");
c=sc.nextDouble();

res=(a+b+c)/3;
System.out.println("Average of three numbers:"+res);


}
}