class Doctor
{
        void Doc()
         {
                 System.out.println("I am an Doctor");
         }
}
class Surgeon extends Doctor
{
        @Override
        void Doc()
         {
                 super.Doc();
                 System.out.println("I am an Surgeon");
         }
}
class Nurse extends Surgeon
{
        @Override
        void Doc()
         {
                 super.Doc();
                 System.out.println("I am an Nurse");
         }
}

public class MethodOver
{
       public static void main(String args[])
       {
                Doctor obj=new Doctor();
                
                obj.Doc();
                
                obj.Doc();
       }
}