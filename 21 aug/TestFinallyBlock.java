public class TestFinallyBlock {
       public static void main(String args[]) {

       try{
           System.out.println("Inside the try block");
           //below code throws divide by zero exception
          int data=25/0;
          System.out.println(data);
          }
          //cannot handle Arithmetic type exception
          //cn only ccept null pointer type exception
        catch(NullPoniterException e) {
          System.out.println(e);
          }
         //execute regrdless of exception occured or not
         finally
            {
           System.out.println("finally block is always executed");
           System.out.println("This is compulsory executed block irrespective of Exception");
            }
           System.out.println("Remaining code block...");
          }
     }


   
         