import Empdetails.Emp;
import java.util.*;
class EmpMain
{
    public static void main(String[] args)
    {
        String name;
        String Design;
        int Empid;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the id of the Employee:= ");
        Empid=sc.nextInt();

        System.out.print("Enter the Name of the Employee:= ");
        name=sc.next();


        System.out.print("Enter the Designation:= ");
        Design=sc.next();

       
        Emp s=new Emp(Empid,name,Design);
        s.display();
      }
 }
       
        