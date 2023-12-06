/* Write a Package MCA which has one class Student.
Accept student detail through parameterized constructor. 
Write display () method to display details. */

package MCA;          //package name declared
public class Student       //class declared
{
    //declaring variables
    public int r_no;      
    public String name;
    public int a,b,c;
    int sum=0;
   
    //constructor used to declared variables
    public Student(int roll, String nm, int m1,int m2,int m3)
    {
       r_no=roll;
       name=nm;
       a=m1;
       b=m2;
       c=m3;
       sum=a+b+c;
    }
      //Displaying the process
      public void display()
       {
         System.out.println("Roll_no :"+r_no);
         System.out.println("Name    :"+name);
         System.out.println("-----MARKS------");
         System.out.println("sub 1       :"+a);
         System.out.println("sub 2       :"+b);
         System.out.println("sub 3       :"+c);
         System.out.println("Total       :"+sum);
         System.out.println("Percentage  :"+sum/3"%");
         System.out.println("---------------------");
       }      
 }