import java.util.Scanner;

public class Guessno {
         
    boolean got=false;
    int Random_no;
    int count=0;
   
    int a[]=new int[10];
    Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        {
        for(int i=0;i<10;i++)
        
         a[i]=sc.nextInt();
         count++;
       }

         if(a[i]=54){
            got=true;
            break;
         }
        }

        
        
       if(a[i]=54){
       System.out.println("How many times user enter a number to choose a correct number"+count+ " times");
       }
       else{
        System.out.println("User fails");
       }
    
 



    


