/*WAP to enter a letter and change the case of
 that letter and also print the 
ASCII value of it.*/

import java.util.*;
public class Alphabate10
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 10 character");
    String input =sc.next();

    char [] charArr=input.toCharArray();   
    int sum=0;
    
    for(int i=0;i<charArr.length;i++);
     {
    sum += (int)(charArr[i]);
     }
      
    
    System.out.println("sum of ASCII codes of that all characters : "+sum);
         
      
    }
 }
      