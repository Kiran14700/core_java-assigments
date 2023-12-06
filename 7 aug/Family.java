class Parents {

    //method in the superclass
    public void Father() {
       System.out.println("I can walk with the help of a stick");
      }
   }
  class Son extends Parents  {       
     public void  Son()  {     
        System.out.println("I can run fast");
     }
    //new method in subcass
     public void Baby()  {
        System.out.println("I can nicely crawl");
     }
  }
class Family {
   public static void main(String args[]) {
    
    // create an object  of the subclass
    Son obj = new Son();

     // call the eat() method
     obj.Father();
     obj.Son();
     obj.Baby();
     }
 }
  