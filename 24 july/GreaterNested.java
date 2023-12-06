//WAP to find Greatest among three number using nested if

import java.util.Scanner; //Scanner class is imported
class GreaterNested  //class name is given
   {
     public static void main(String args[])
       {
          int a,b,c;    //Varible declaration
          Scanner sc=new Scanner(System.in);    //Scanner object is executed 
          //Asking input enter first number
          System.out.println("Enter the first number");
          a=sc.nextInt();
          //Asking input enter second number
          System.out.println("Enter the second number:");
          b=sc.nextInt();    
          //Asking input enter third number            
          System.out.println("Enter the third number:");
          c=sc.nextInt();
            //check if the first number is greater than second number
            if(a>b)
              { 
              //check if the first number is greater than third number       
               if(a>c)
               System.out.println("The First number is greater");
              }
            //check if the second number is greater than first number
            else if(b>a)
              {
              //check if the second number is greater than third number
              if(b>c)
              System.out.println("The Second number is greater");
              }
            //if any of the conditions doesn't match then this condition is applied
            else
             {
              System.out.println("The Third number is greater");
             }
          }
    }
