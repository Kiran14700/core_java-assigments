public class MultipleCatchBlock1
{
     public static void main(String[] args)
      {
      try
      {
       int a[]=new int[]
       a[5]=50/0;
       System.out.println("The result is"+data);
      }
       catch(ArrayIndexOutofBoundsException e)
       {
           System.out.println("ArrayIndexOutofBounds Exception occurs");
       }
       catch(ArithmeticException e)
       {
           System.out.println("ArithmeticException occurs");
       }

       catch(Exception e)
       {
           System.out.println("Parent Exception occurs");
       }
       System.out.println("rest of the code");
     }
  }

 
