import java.util.Scanner;
class Student
{
  String name,year;
  char div;
  
  int rollno,age,ch;
  Scanner sc=new Scanner(System.in);


          public void accept()
             { 
               
               System.out.println("Enter your name:");
               name=sc.nextLine();
               System.out.println("Roll number:");
               rollno=sc.nextInt();
               System.out.println("Enter your division: A or B ?");
               div=sc.next().charAt(0);
               System.out.println("Age:");
               age=sc.nextInt();
               System.out.println("You are in first,second or third year");
               year=sc.nextLine(); 
                
             }
 
          public void info()
           {         
                   System.out.println("If you are belongs to computer science press 1 , for Information technology press 2 , for Bcom press 3") ;
                   ch=sc.nextInt();            
                    switch(ch)
                     {
                        case 1: 
                            { 
                               System.out.println("Name: "+name);
                               System.out.println("Roll number: "+rollno);
                               System.out.println("Age: "+age);
                               System.out.println("Your are studying in Bachelor's of computer science"+year); 
                               System.out.println("Division: " +div);
                               break;
                            }                     
                        case 2:
                            {
                               System.out.println("Name: "+name);
                               System.out.println("Roll number: "+rollno);
                               System.out.println("Age: "+age);
                               System.out.println("Your are studying in Bachelor's of information technology" +year); 
                               System.out.println("Division "+div);
                               break;
                            }
                        case 3:
                            { 
                               System.out.println("Name: "+name);
                               System.out.println("Roll number: "+rollno);
                               System.out.println("Age: "+age);
                               System.out.println("Your are studying in Bachelor's of commerce"+year); 
                               System.out.println("Division: " +div);
                               break;
                            }
                        default:
                              System.out.println("Error");
                              break;
                        
                       }
               }
        }
   

     public class Main3
        {
          public static void main(String args[])
           {
             Student obj= new Student();
             //calling method
             obj.accept();
             obj.info();
           }
        }  
        
   
 
