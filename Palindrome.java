import java.util.Scanner; //Scanner object is imported
class Palindrome
{
public static void main(String args[])
{
int a,b,c=0,input;
Scanner sc=new Scanner(System.in);

System.out.println("Enter a number: ");
a=sc.nextInt();
input=a;

while(a>0)
{
   b=a%10;
   c=c+b*b*b;
   a=a/10;
}

if(input==c)
{
System.out.println("The number is Palindrome number");
}
else{
System.out.println("The number is not Palindrome number");
}

}
}

