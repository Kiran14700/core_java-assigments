import java.util.Scanner;
class Greatestno
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.print("Enter your first number");
a=sc.nextInt();
System.out.print("Enter your second number");
b=sc.nextInt();

if(a>b)
{


System.out.println(a+"is greater than"+b);
}
else
{
 System.out.print(b+"is greater than"+a);
}

}
}