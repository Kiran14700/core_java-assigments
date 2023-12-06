import java.util.Scanner;
public class Arrayrev
    {
    public static void main(String args[])
       {
         int a[]=new int[5];
         int max=0;
         Scanner sc=new Scanner(System.in);
         for(int element:a)
            {
         System.out.println("Enter the numbers");
         element=sc.nextInt();
            
         
             if(element>max)
               {
                 max=element;
                 System.out.println(element);
               }
           } 
        }
    }
  
                
              
                 
         
   

                                  
     

         
         
 
        
        
      