//WAP to accept number from user and generate table of it.
import java.util.Scanner;
class Demotable
    {
     public static void main (String args[])
        {
         int i ;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         i=sc.nextInt();
         System.out.println("table ");
         for(i=1;i<11;i++)   //(i=1;i<51;i++)
           {
             System.out.println(i+"*" + i + "="+ (i * i));
           }
        } 
     }