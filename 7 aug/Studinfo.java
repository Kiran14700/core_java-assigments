import java.util.*;    
class Marksheet
     {    int eng,math,mar,phy,bio,chem,res,per ; 
          String Nam_stud;
          char Div;
         Scanner sc=new Scanner(System.in);        
      }
     
         class PersonalInfo extends Marksheet
         {
            public void student()
            {
              System.out.println("Name of the student");
              Nam_stud =sc.nextLine();
              System.out.println("Division:");
              Div=sc.next().charAt(0);
              
           }
         }
         class Studpersonal extends PersonalInfo
         {
           public void Subjects()
            {             
              {                                    
               System.out.println("Enter the marks of English");
                eng=sc.nextInt();
               System.out.println("Enter the marks of Maths");         
               math=sc.nextInt();
               System.out.println("Enter the marks of Marathi");
               mar=sc.nextInt();
               System.out.println("Enter the marks of Physics");         
               phy=sc.nextInt();
               System.out.println("Enter the marks of Biology");
                bio=sc.nextInt();
               System.out.println("Enter the marks of Chemistry");         
               chem=sc.nextInt();  
              }         
            }
         }
         class overall extends Studpersonal
         {
            public void results()
            {
               res=(eng+math+mar+phy+bio+chem) ;  
               per=(((eng+math+mar+phy+bio+chem)*100)/600) ;
           }
         }
         class overall1 extends overall
         {
            public void display()
            {
            
              System.out.println("The name of the student: "+Nam_stud);
              System.out.println("The Division of the student: "+Div);
            
              
              System.out.println("The Total mark of the student: "+res+"out of 600 marks");
             System.out.println("The percentage of the student: "+per+"%");
            
           }
         }
         public class Studinfo
         {
             public static void main(String args[])
             {
               overall1 obj=new overall1();
               obj.student();
               obj.Subjects();
               obj.results();
               obj.display();
             }
         }
   