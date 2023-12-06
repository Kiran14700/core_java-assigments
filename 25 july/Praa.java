//pratice

import java.util.Scanner;
class Praa
{
public static void main(String args[])
{

int num,i,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
num=sc.nextInt();

for(i=0;i<=num;i++)

if(i>0){
c=i+1;


System.out.println("The reverse is:"+c+"."+c);
}
}
}