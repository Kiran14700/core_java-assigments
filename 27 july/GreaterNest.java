//WAP to find Greatest among three number using nested if

import java.util.Scanner; //Scanner class is imported
class GreaterNest //class name is given
   {
     public static void main(String args[])
       {
          int num1,num2,num3;    //Varible declaration
          Scanner sc=new Scanner(System.in);    //Scanner object is executed 
          //Asking input enter first number
          System.out.println("Enter the first number");
          num1=sc.nextInt();
          //Asking input enter second number
          System.out.println("Enter the second number:");
          num2=sc.nextInt();    
          //Asking input enter third number            
          System.out.println("Enter the third number:");
          num3=sc.nextInt();
            //check if the first number is greater than second number
            if(num1>num2)
              { 
              //check if the first number is greater than third number       
               if(num1>num3)
               System.out.println("The First number is greater");
              }
            //check if the second number is greater than first number
            else if(num2>num3)
              {
              //check if the second number is greater than third number
              if(num2>num3)
              System.out.println("The Second number is greater");
              }
            //if any of the conditions doesn't match then this condition is applied
            else
             {
              System.out.println("The Third number is greater");
             }
          }
    }
