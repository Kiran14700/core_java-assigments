import java.util.Scanner;
class PersonInfo
    {
      public static void main(String args[])
       {
        int id;
        String pname;
            public void accept()      
             {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter your name and id:");
              pnme=sc.nextLine();
              id=sc.nextInt();
             }
            public void display()        
               { 
                 System.out.print("You aare welcome to the organaiztion!!!"+pname+"/t"+"your id is" +id:);
               }
            public static void man(String args[])
               {
                 PersonInfo obj=new PersonInfo();   //object declaration
                 obj.accept();
                 obj.display();
               }
         }
    }


