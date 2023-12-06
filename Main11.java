import java.util.Scanner;
class Dog
   {

    String breed;
    int age,sleep,eats,bark;
    String color;
            void input()
               {
                 Scanner sc=new Scanner(System.in);
                 System.out.println("Enter the breed of dog");
                 breed=sc.nextLine();
                 System.out.println("Enter the age of dog");
                 breed=sc.nextInt();
                 System.out.println("Enter the color of dog");
                 color=sc.nextLine();
                 System.out.println("how much time he eats,mean in a day 3 or 4 times");
                 eats=sc.nextInt();
                 System.out.println("how much time your dogs sleeps in a day ,mean 8 hrs or 10hrs");
                 sleep=sc.nextInt();
                 System.out.println("how much time your dogs sleeps in a day ,mean 8 hrs or 10hrs");
                 bark=sc.nextInt();
               }

           void barking()
            {
                 System.out.println("Your dogs eats in day:"+eats+ "times");
            }

           void hungry()
            {
                System.out.println("Your dogs eats in day:"+eats+ "times");

            }

          void sleeping()
             {
                 System.out.println("Your dogs sleep"+sleep+"hours in a day");
             }
         }
          public class Main11
         {
          public static void main(String args[])
           { 
             dog obj=new dog();
           obj.input();
          obj.barking();
          obj.hungry();
          obj.sleeping();
}
}