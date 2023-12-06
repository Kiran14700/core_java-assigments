import java.util.*;    //import the java package   
class Student          //define the class
        { 
          //variable declaration
          int roll_no,eng,math,phy,bio,chem,per,res ; 
          String Nam_stud;          
          Scanner sc=new Scanner(System.in);   //Scanner object declared     
                    
                 public void StudentData()       //taking input from user
                   {
                     System.out.println("Name of the student");
                     Nam_stud=sc.nextLine();
                     System.out.println("Roll no:");
                     roll_no=sc.nextInt();
                     System.out.println("Enter the marks of English");
                     eng=sc.nextInt();
                     System.out.println("Enter the marks of Maths");         
                     math=sc.nextInt();              
                     System.out.println("Enter the marks of Physics");         
                     phy=sc.nextInt();
                     System.out.println("Enter the marks of Biology");
                     bio=sc.nextInt();
                     System.out.println("Enter the marks of Chemistry");         
                     chem=sc.nextInt();
                                 
                   }
                   
         }
         class Display extends Student
         {
            public void Displayresult()           //for displaying result
            {            
              System.out.println("The Name of the student: "+Nam_stud);
              System.out.println("The Roll no of the student: "+roll_no);  
              System.out.println("Students all subjects marks!!!");
              System.out.println("English got" +eng+ " marks");
              System.out.println("Maths got" +math+ " marks");
              System.out.println("Physics got" +phy+ " marks");
              System.out.println("Biology got" +bio+ " marks");
              System.out.println("Chemistry got" +chem+ " marks");
              res=(eng+math+phy+bio+chem);                                     
              System.out.println("The Total mark of the student:"+res+" out of 600 marks");                
              per=(((eng+math+phy+bio+chem)*100)/500); 
              System.out.println("The Percentage of the student:"+per+"%");            
            }
         }
         public class Marksheet
         {
             public static void main(String args[])     //main method started
             {
               Display obj=new Display();          //class object is created
               obj.StudentData();                  //class object method is called     
               obj.Displayresult();               
             }
         }
   