import java.util.*;
public class ImissmatchExc {
       public static void main(String args[]) {
     
       Scanner sc=new Scanner(System.in); 
       try 
        {
          System.out.println("Enter a number");
          int a=sc.nextInt();
          System.out.println(a*a);
        }

        catch(InputMisMatchException e)
          {
          System.out.println(ex);
          }
         finally 
          {
           System.out.println("The excepted input is an integer Value!!you got it");
          }
     }
}

   
         