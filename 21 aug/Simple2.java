import java.util.*;;
public class  Simple2
   {
     public static void main(String args[])
        {
           StringTokenizer st = new StringTokenizer("my,name,is,kiran");
           // printing next token 
           System.out.println("Next token is : " + st.nextToken(","));
       
     }
 }