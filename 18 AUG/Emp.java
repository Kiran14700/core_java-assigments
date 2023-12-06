class prc1 {
  String name ;
  int id, sal;
   
  public void getSalary()
     {
       System.out.println("Name of the employee: "+name);
       System.out.println("ID of the employee: "+id);
       System.out.println("Salary of the employee: "+sal);
    }
    public void Details()
    {
      return sal;
    }
    
  }
  
  public class Emp {
    public static void main(String[] args) {
      
      prc1 obj1=new prc1();
      obj1.name="tanuja";
      obj1.id=5;
      obj1.sal=50000;
      prc1 obj=new prc1();
      obj.name="Bt";
      obj.id=7;
      obj.sal=60000;
      
      // System.out.println(id);
      // System.out.println(name);
      // obj.Details();

      obj1.getSalary();
      int sal=obj.Details();
     

  }

}