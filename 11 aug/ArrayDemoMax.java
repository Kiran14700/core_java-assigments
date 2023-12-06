import java.util.Scanner;
public class ArrayDemoMax
{
  public static void main(String args[])
   {
     int i;
     int max;   //to store the minimum value
     int[] a=new int[5];                        //Array declaration
                      
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter five number");

     for(i=0;i<5;i++)
     {
       a[i]=sc.nextInt();
     }

     max = a[0];  //assigning a[0] value in min variable

      for(i=1;i<5;i++)
      {    
       if(a[i]>max)
        {
          max=a[i];
         }
       }
        System.out.println("The maximum value is:"+ max);   
        } 
     }
   
     