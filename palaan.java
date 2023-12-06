import java.util.Scanner;
class palaan
{
public static void main(String args[])
{
 int a,b,c=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a number");
 a=sc.nextInt();

 
 
 while(a>0) //153
 {
 b=a%10;
 c=(c*10)+b;
 a=a/10;
 
 }



 System.out.println("Armstrong"+c);
   

 
}
}
 