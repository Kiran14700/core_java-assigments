/*WAP to enter a letter and change the case of
 that letter and also print the 
ASCII value of it.*/

import java.util.*;
public class Alphabate
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    char chr1,chr2;
    System.out.println("Enter a character");
    chr1=sc.next().charAt(0);
         
        if(Character.isUpperCase(chr1)==true)
        {
           chr2=Character.toLowerCase(chr1);
           System.out.println("The Lowercase of "+chr1+" is "+chr2);
           System.out.println("The Asci value of "+chr1+" is "+(int)chr2);
        }
        else
        {
           chr2=Character.toUpperCase(chr1);
           System.out.println("The Uppercase of "+chr1+" is "+chr2);
           System.out.println("The Asci value of "+chr1+" is "+(int)chr2);
        }
    }
 }
      