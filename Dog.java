import java.util.Scanner;
public class Dog
   {

    String breed,color;
    int age,sleep,eats;
    
            void input()
               {
                 Scanner sc=new Scanner(System.in);
                 System.out.println("Enter the breed of dog");
                 breed=sc.nextLine();
                 System.out.println("Enter the age of dog");
                 age=sc.nextInt();
                 System.out.println("Enter the color of dog");
                 color=sc.nextLine();   
                 System.out.println("how much time he eats,mean in a day 3 or 4 times");
                 eats=sc.nextInt();
                 System.out.println("how much time your dogs sleeps in a day ,mean 8 hrs or 10hrs");
                 sleep=sc.nextInt();              
          
                 
               }

           void barking()
            {
                 System.out.println("The breed of your dog:"+breed);
                 System.out.println("The age of your dog:"+age);
                       
                 System.out.println("The color of your dog is:" +color);
                 System.out.println("Your dog bark in thiefs");
            }

           void hungry()
            {
               
                System.out.println("Your dog eats in a day:"+eats+ "times");

            }

          void sleeping()
             {
                
                
                 System.out.println("Your dog sleep"+sleep+"hours in a day");
             }
         
             
              public static void main(String args[])
               {   
                Dog obj=new Dog();
                obj.input();
                obj.barking();
                obj.hungry();
                obj.sleeping();

               }
}
