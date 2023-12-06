import java.util.Scanner;
 //Scanner object is imported

class Factorial
{
public static void main(String args[])
{
long num,i=1,fact=1;
Scanner sc=new Scanner(System.in);

System.out.println("Enter a number: ");
num=sc.nextInt();


while(i<=num)
{
   fact=fact*i;
   i++;

System.out.println("Factorial of"+num+"is:"+fact);

}
}
}


