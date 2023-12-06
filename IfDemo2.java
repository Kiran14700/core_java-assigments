
//if demo for greater than and less than operator
import java.util.Scanner;
class IfDemo2
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the First number's");
a=sc.nextInt();
System.out.print("Enter the Second number");
b=sc.nextInt();
if(a>b)
{


System.out.println(a+" is greater than "+b);
}
if(a<b)
{
 System.out.print(a+" is less than "+b);
}

}
}