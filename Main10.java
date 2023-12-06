import java.util.Scanner;
class Person
    {
            int unique_id,age,time;
            string name,city,gender,game;
                                                 //variables,fields,properties
            public void input()      
             {
              Scanner sc=new Scanner(System.in);              
              System.out.println("Enter the Unique id:");
              unique_id=sc.nextInt();
              System.out.println("Enter yout Name");
              name=sc.nextLine();
              System.out.println("Enter the Age");
              age=sc.nextInt();
              System.out.println("Enter the City");
              city=sc.nextLine();
              System.out.println("Enter the Gender");
              gender=sc.nextLine();
             }
             
            public void study()        
               { 
                  
                System.out.println("Your id is:"+unique_id+"your name:"+name+"You are studying in Bachelor's of Computer Science in Third year")  
               }
            public void sleep()        
               { 
                 
                 System.out.println("Enter you sleep time in hours");
                 time=sc.nextInt();
                 System.out.println("Everyday you sleep" +time+ "hours");
                  
               }
             public void play()        
               { 
                 
                 System.out.println("Enter your Favourite game");
                  game=sc.nextline();
                 System.out.println("Your hobby is playing: " +game);
                  
               }
         
          }

          public class Main10
          {
             public static void main(String args[])
               {
                 Person obj=new Person();   //object creation
                 obj.input();
                 obj.study();
                 obj.sleep();
                 obj.play();
                 
               }
         }