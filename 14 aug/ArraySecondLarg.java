import java.util.Scanner;
public class ArraySecondLarg
{
  public static void main(String args[])
   {     
     //creating an instance of an array            
     int[] arr=new int[5]; 
     Scanner sc=new Scanner(System.in);                
     System.out.println("Enter the numbers:");     
     for(int i=0;i<5;i++)                           
     { 
        arr[i]=sc.nextInt();
     }
     int tmp=0;
     for(int i=0;i<5;i++)
     {        
        for(int j=i+1;j<5;j++)
          {             
             if(arr[i]<arr[j])
                {
                  tmp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=tmp;            
                }
           }
          System.out.print(arr[i]+" "); 
      }      
       System.out.println("The second Largest number is:"+arr[1]);                   
    
  }
}
   
     