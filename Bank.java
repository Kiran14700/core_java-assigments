import java.util.Scanner;
class Bank
   {
    public static void main(String args[])
       {
         int a=50000;
         Scanner sc=new Scanner(System.in);
         System.out.println("press 1 for withdraw press 2 for deposit");
         int h=sc.nextInt();
         
               switch(h) 
                   {
                      case 1:
                      System.out.println("Enter the amount you want to withdraw");         
                      int b=sc.nextInt();
                      System.out.println("you withdraw"+b+"rs your present balance is"+(a-b)" Rs");
                      break;

                      case 2:
                      System.out.println("Enter the amount you want to deposit");
                      int c=sc.nextInt();
                      System.out.println("you deposit"+c+"rs your present balance is"+(a+c)" Rs"); 
                      break; 
     
                      default:
                      System.out.println("Error");
                      break;
       
                   }  
         }
    }

               
         
     