import java.util.Scanner;    
class Employee
     {        
         double sal;
         int id;
         String name;
         Scanner sc=new Scanner(System.in);
      }           

 class PermanentEmp extends Employee
            { 
              public void accept() 
                 {
                   System.out.println("Enter the ID of employee");         
                   id=sc.nextInt();
                   System.out.println("Enter the name of the employee");         
                   name=sc.next(); 
                   System.out.println("Enter the salary");
                   sal=sc.nextDouble();
                                 
                 } 
                public void hike()
                   { 
                     System.out.println("The employee ID:"+id);
                     System.out.println("The employee name: "+name);
                     double res=sal+(sal*0.10);
                     System.out.println("The employee salary: "+sal+" is hike by 10% i.e "+res);
                   }    
             }
 class ContractEmp extends Employee
            {   
                public void accept() 
                 {
                   System.out.println("Enter the ID of employee");         
                   id=sc.nextInt();
                   System.out.println("Enter the name of the employee");         
                   name=sc.next(); 
                   System.out.println("Enter the salary");
                   sal=sc.nextDouble();                               
                 }                   
                    public void hike()
                    {                                       
                      System.out.println("The employee ID:"+id);
                      System.out.println("The employee name: "+name);
                      double ress=sal+(sal*0.5);  
                      System.out.println("The employee salary: "+sal+" is hike by 5% i.e "+ress);                                    
                    }
             }
  
       
         public class HierInheriDemo
         {
             public static void main(String args[])
             {
              int emptype;
              Scanner sc=new Scanner(System.in);
              System.out.println("If you are a permanent employee press 1 and press 2 for contract employee");                   
              emptype=sc.nextInt();
              if(emptype==1)             
                   {
                     PermanentEmp obj=new PermanentEmp();
                     obj.accept();
                     obj.hike();                     
                   }
               else if(emptype==2)
                  { 
                   ContractEmp obj=new ContractEmp();
                   obj.accept();
                   obj.hike();
                   }
                   else
                   {
                   System.out.println("error");
                   }                                                      
               } 
           }
   