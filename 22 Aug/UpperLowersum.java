import java.util.*;
public class UpperLowersum
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    char c1;
    int upp=0,low=0;    
         
       System.out.print("How many character you want to input ?");
       int n=sc.nextInt();
       System.out.print("Enter "+n+" characters");               
        for(int i=1;i<=n;i++)
        {
           c1=sc.next().charAt(0);                  
           if(Character.isUpperCase(c1))
           {
           upp++;
           }
           
         if(Character.isLowerCase(c1))
           {            
           low++;
           }           
           
        }
     System.out.println("The Characters you entered have "+upp+" Uppercases  and "+low+" Lowercases");
           
         
    }
 }
      