public class MethodOverload
{
     int add(int num1, int num2)
     {
          return num1+num2;
     }
     int add(int num1, double num2, int num3)
     {
          return  (int) (num1+num2+num3);
     }
     int add(int num1,int num2,int num3,int num4)
     {
          return num1+num2+num3+num4;
     }
     public static void main(String args[])
     {
         MethodOverload obj=new MethodOverload();
         //this will call the first add method
         System.out.println("Sum of two numbers: "+obj.add(10, 20));
         //this will call the second add method
         System.out.println("Sum of three numbers: "+obj.add(10, 5.5, 20));
         //this will call the third add method
         System.out.println("Sum of four numbers: "+obj.add(10, 20,30,40));
        }
    }