//WAP a program to reverse a given String without using reverse() method
import java.util.Scanner;            //package declared

public class StringReverse {         //class declared

    public static void main(String[] args) {
        String name;
        String rev="";           //variables declaration

        Scanner sc=new Scanner(System.in);        //Scanner object is declared
   
        //Asking input to enter the words
        System.out.println("Enter the words ");
        name=sc.next();

        //By using loop we reverse the words input enter
        
           for(int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
           }
             System.out.println("The reverse of words user enters: " +rev);
        }

    }    
