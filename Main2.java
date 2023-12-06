public class Student
{
  String name;
  int rollno;
  int age;

  void info()
  {
  System.out.println("Name: "+name);
  System.out.println("Roll number: "+rollno);
  System.out.println("Age: "+age);
  System.out.println("Your are studying in Bsccs Third year:"); 
  }

   
}
   class Main2
{
    public static void main(String args[])
    {
     Student student =new Student();

     //caalling method
      student.info();
      
                     
    }
 }