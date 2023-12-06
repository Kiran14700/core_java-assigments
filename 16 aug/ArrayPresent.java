//using Linear search algorithm
import java.util.Scanner;

class ArrayPresent
    {
      public static void main(String []args)
        {            
          int a[]=new int[10];  //Array declaration syntax
          int count=0;          //Variable declaration
         
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the numbers: "); 
          for(int i=0;i<10;i++) 
           {             
               a[i]=sc.nextInt();
           }                                       
          System.out.println("Enter the number you want to check is present or not");
           int b=sc.nextInt(); 
           for(int i=0;i<10;i++)           
             {
               if(a[i]==b)   
                 { 
                  count++;
                 }
             } 
             if(count>0)
                 {                             
                   System.out.println(b+ "present in the element") ;
                   System.out.println(b+ "present in the "+count+" index") ;
                 }
                 else
                  {
                  System.out.println(b+ "is not present in the element") ;
                  }
            }
      }
          
  
             




       
       
                     