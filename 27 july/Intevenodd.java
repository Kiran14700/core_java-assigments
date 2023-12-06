import java.util.Scanner;  //importing scanner object
class Intevenodd
     {
        public static void main(String args[])
           {
          int num,sum_even=0,sum_odd=0;  //declaration of variables
          char ans;
          Scanner sc=new Scanner(System.in);
 
             do{
                  System.out.println("Enter a number");   //taking integer num from user
                  num=sc.nextInt();

                  if(num%2==0)
                   {
                     sum_even=sum_even+num;
                   }
                  else
                   {
                     sum_odd=sum_odd+num;
                   }
                     System.out.println("Do you want to continue?(y/n):"); //taking character input yes or no 

                     ans=sc.next().charAt(0);

                   }
             while(ans=='y'||ans=='Y');

             System.out.println("sum of even numbers is:"+sum_even); //printing even number sum
             System.out.println("sum of odd numbers is:"+sum_odd); //printing odd number sum                                                                                                                                                                                                         
        }
}


