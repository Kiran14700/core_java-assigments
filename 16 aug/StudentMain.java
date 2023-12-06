//Create a main class which will use above package and calculate total marks and percentage.

import MCA.Student;        //importing package from Student class
import java.util.Scanner*;  //importing scanner package
class StudentMain           //class declared
{
    public static void main(String[] args)
    {
        //declaring variables
        String nm; 
        int roll;
        int m1,m2,m3;
        Scanner sc=new Scanner(System.in);      //Scanner object declared
        
        //Asking input to enter the roll no of the student 
        System.out.print("Enter Roll no:= ");
        roll=sc.nextInt();
    
        //Asking input to enter the name of the student 
        System.out.print("Enter Name:= ");
        nm=sc.next();
        
        //Asking input to enter the marks of the student as per subjects
        System.out.print("Enter English mark:= ");
        m1=sc.nextInt();
        System.out.print("Enter Mathematics mark:= ");
        m2=sc.nextInt();
        System.out.print("Enter Science mark:= ");
        m3=sc.nextInt();

        Student s=new Student(roll,nm,m1,m2,m3);
        s.display();       //displaying the object 
     }
 }
       
        