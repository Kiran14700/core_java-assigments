class person1 {
      private String name;
      private int age;

      public void setName(String name) {
           this.name = name;
      }

     public String getName()  {
           return name;
      }
      public void setAge(int age) {
           this.age = age;
      }
      public int  getAge()  {
           return age; 
      }
  }

public class Main45 {
    public static void main(String[] args) {
       
     Person1 obj = new Person1();

     obj.setName(name:"kiran");
     obj.setAge(age:20);


     System.out.println("Name: "+obj.getName());

     System.out.println("Age: "+obj.getAge());
  }
}