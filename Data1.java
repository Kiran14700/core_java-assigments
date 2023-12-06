class Info9{
     private String name;

    //getter method
    public String getName()  {
        return this.name;
    }
    // setter method
    public void setName(String name) {
         this.name= name;
    }
}
public class Data1{
   public static void main(String[] main) {
       Info9 d = new Info9();
   
       //access the private variable using the getter and setter 
       d.setName("Ganesha");
       System.out.println(d.getName());
     }
}

        
