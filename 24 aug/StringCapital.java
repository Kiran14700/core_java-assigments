import java.util.Scanner;       //package declared

public class StringCapital {     //class declared
    public static void main(String[] args) {
        String word;             //String variable declared
        Scanner sc=new Scanner(System.in);        //Scanner object is declared
        
        //ASking input to enter the name
        System.out.println("Enter the name");
        word=sc.next();
        //By using toUpperCase()  method  we captialie the name input enter
        System.out.println("Entered name capital form is:  "+word.toUpperCase());
     
    }
    
}
