
// //WAP to print even numbers in 
// range of 1 to 200
class DemoEven
 {
   public static void main (String args[])
   {
     int i;
     System.out.println("The even numbers are:");

     for(i=1;i<201;i++) 
       {
        if(i%2==0)
         {                               
           System.out.println(i);
         }
       }
   }
}