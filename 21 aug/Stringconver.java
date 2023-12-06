import java.util.*;
public class Stringconver {
       public static void main(String args[]) {     
       Scanner sc=new Scanner(System.in);        
       System.out.println("Enter an number");
       String input =sc.nextLine();
       try 
        {
          int nm=integer.parseInt(input);
          System.out.println("Successfully converted to integer:"+nm);
        }


        catch(NumberFormatException e) {
          System.out.println("Input is not a valid integer");
          }
  
     }
}

   
         