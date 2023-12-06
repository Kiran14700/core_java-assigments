import java.util.Scanner;
public class ArraySum
{
  public static void main(String args[])
   {
     int sum=0;
     //creating an instance of an array            
     int[] a=new int[7]; 
     Scanner sc=new Scanner(System.in);                  
     System.out.println("Enter the elements:"); 
           for(int i=0;i<7;i++)
               {            
                  a[i]=sc.nextInt();          
                  sum=sum+a[i]; 
               }
           System.out.println("Sum of all the elements :"+sum);
           System.out.println("Average of all the elements :"+sum/7);
       }
       
  }     
       
       