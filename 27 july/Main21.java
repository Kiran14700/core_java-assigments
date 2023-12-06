class Person1  {
     private String name;
     

    //setter method
    public void setName(String name)  {
        this.name =name;
    }
    // getter method
    public String getName() {
         return name;
    }
 
}

public class Main21{
   public static void main(String[] main) {
       Person1 d = new Person1();
   
       //access the private variable using the getter and setter 
       d.setName("Ganesha");
       System.out.println(d.getName());
     }
}