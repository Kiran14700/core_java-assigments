
 import java.util.ArrayList;
  public class ArrayUpdate{
   public static void main(String args[]) {
    ArrayList<Integer> employeelist=new ArrayList<Integer>();  //creating arrylist
     employeelist.add(1); 
     employeelist.add(2);  //Adding object in arraylist
     employeelist.add(3);
     employeelist.add(4);

       //printing the arraylist object
       System.out.println(employeelist);
   
       //to access particular value
       int id1 = employeelist.remove(2);
       System.out.println("Updated EmployeeList: "+employeelist);
       System.out.println("Removed Element: "+id1);
    
       //Update element 
       employeelist.set(2, 10);  
       System.out.println("Modified EmployeeList: "+employeelist);
  
       //remove particular element
       int id = employeelist.get(1);
       System.out.println("Employee id at index 1: "+id);
    
    }
 }