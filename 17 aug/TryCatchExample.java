public class TryCatchExample 
{
     public static void main(String[] args)
      {
      try
      {
       int data=50/0;
       System.out.println("The result is"+data);
      }
       
       catch(Exception e)
       {
           System.out.println(e);
       }
       System.out.println("WELCOME TO CONCEPT OF EXCEPTION HNDLING");
     }
  }

 
