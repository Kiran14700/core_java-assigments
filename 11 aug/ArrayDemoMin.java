import java.util.Scanner;
public class ArrayDemoMin
{
  public static void main(String args[])
   {
     int i;
     int min;   //to store the minimum value
     int[] a=new int[5];                        //Array declaration
                      
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter five number");

     for(i=0;i<5;i++)
     {
       a[i]=sc.nextInt();
     }

     min = a[0];  //assigning a[0] value in min variable

      for(i=1;i<5;i++)
      {    
       if(a[i]<min)
        {
          min=a[i];
         }
       }
        System.out.println("The minimum value is:"+ min);   
        } 
     }
   
     