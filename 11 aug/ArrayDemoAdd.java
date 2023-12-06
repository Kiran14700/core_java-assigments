import java.util.Scanner;
public class ArrayDemoAdd
{
  public static void main(String args[])
   {
     int i;
     int[] a=new int[5]; 
     int[] b=new int[5]; 
     int[] c=new int[5];  //Array declaration
                      
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter five number");
     for(i=0;i<5;i++)
     {
       a[i]=sc.nextInt();
     }
     System.out.println("Enter anotheir five number");
     for(i=0;i<5;i++)
     {
       b[i]=sc.nextInt();
     }
     System.out.println("The Addition is:");
     for(i=0;i<5;i++)
      {
       c[i]=(a[i]+b[i]);       
       System.out.println(c[i]);
      }
   }
 }
     