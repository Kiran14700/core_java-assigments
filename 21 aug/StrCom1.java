import java.util.*;
public class StrCom1
 {
    public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your name in captial letters");
         String str1=sc.next();
         String str2=str1.toUpperCase();
         
         int i=str1.compareTo(str2);
         if(i==0)
          {
         System.out.println("Your name is"+str1);
           }
          else
            {
         System.out.println("Your not Write your name in Capital letters,write your name like this: "+str2);
           }
      }
 }
        