import java.util.*;
class BinarySearch
{
    public static void main(String args[])
     {
            int[] arr=new int[10];
            Scanner sc=new Scanner(System.in);
            int li=0;
            int hi=arr.length-1;
            int mi=(li+hi)/2;           
            int search=0;
            System.out.println("Enter the number");
            for(int i=0;i<10;i++)
              {
               arr[i]=sc.nextInt();               
              }  
             int temp=0;
             for(int i=0;i<=9;i++)                           
              {        
                 for(int j=i+1;j<10;j++)
                  {         
                    if (arr[j] < arr[i])
                       {
                         temp=arr[i]; 
                         arr[i]=arr[j];
                         arr[j]=temp;                         
                       }                              
                  }                   
                    System.out.print(arr[i]+" ");   
              }
           System.out.println(" "); 
           System.out.println("Enter the element you want to search: ");
             search=sc.nextInt();

            while(li <= hi)
            {
            
                   if(arr[mi]==search)
                   {    
                         System.out.println("Element is at "+mi+" index position");
                         break;
                   }
                   else if(arr[mi]<search)
                   {
                         li=mi+1;
                   }
                   else 
                   {
                         hi=mi-1;
                   }
                   mi=(li+hi)/2;
            }
          
     
       } 
  }