//Create package MyArray to accept 10 values from user.

package MyArray;          //package name declared
import java.util.Scanner; //importing scanner package
public class Binary       //class declared
   {    
    Scanner sc=new Scanner(System.in);   //Scanner object is declared
    public int arr[]=new int[10];  //declaring array
    
    public void Accept()
    {
        //taking inputs from the user and inserting them as array     
            System.out.println("Enter the elements : ");
            for(int i=0;i<10;i++)
          {
             arr[i]=sc.nextInt();
          }  
        //sorting the array process
        int temp=0;
        for(int i=0;i <10;i++)
        {
            for(int j=i+1;j<=arr.length-1;j++)
            {                
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;            
                }
            }
        }
        
        System.out.println("--------After Sorting---------");
        
        //printing the array
        for(int i = 0;i<10;i++)
        {
            System.out.println(arr[i]); 
        }        
         System.out.println("------------------------------");
    }       
}