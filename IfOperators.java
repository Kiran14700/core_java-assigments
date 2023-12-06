

/*
if(test condition)
{
body of the code.
}

else if(test condition)
{
body of the code
}
else
{
code body
} */

// wap to check whether the number entered by user  is greater than 50,less than 50 or more than 100, print correct message accordingly
import java.util.Scanner;
class IfOperators
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
a=sc.nextInt();



if(>50 && a<=100)   //used AND operation
{
System.out.println("You have entered value greater than 50");
}
else if(a>100)
{
 System.out.println("You have entered value greater than 100");
}
else

{
 System.out.println("You have entered value less than 50");
}


}
}