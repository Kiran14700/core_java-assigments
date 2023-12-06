import java.util.Scanner;
public class ArrayAscendingHard
{
  public static void main(String args[])
   {     
     //creating an instance of an array            
      int arr[]=new int[5];
      Scanner sc=new Scanner(System.in);  
      System.out.println("Enter the elements:");
      for(int i=0;i<5;i++)
      {
        arr[i]=sc.nextInt();               
      }                  
     //sorting logic
     int temp=0;
     for(int i=0;i<5;i++)                           
     {       
       for(int j=i+1;j<5;j++)
        {
         
          if (arr[i] > arr[j])
          {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
 
          }
           
        System.out.print(arr[i]+" ");   
        } 
     }
  }
}
   
     