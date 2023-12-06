package Empdetails;
public class Emp
{
    public int Empid;
    public String Empname;
    public String Designation;
    
    public Emp(int id, String name, String Design)
    {
       Empid=id;
       Empname=name;
       Designation=Design;
      
    }
      public void display()
       {
        System.out.println("---------------------");
         System.out.println("Name of the Employee   :"+Empname);
         System.out.println("Employee id            :"+Empid);
        
         System.out.println("Designation            :"+Designation);

         
        System.out.println("---------------------");
 }      
}