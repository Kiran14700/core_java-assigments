//0 1 1 2 3   5  8
class DemoFibo
  {
    public static void main (String args[])
      {
        int a=0,b=1; 
        System.out.print(a+" "+b+" ");

        for(int i=1;i<=5;i++)  
         {
          int c=a+b;
          System.out.print(c+" ");
          a=b;
          b=c;
         }
      }
   }