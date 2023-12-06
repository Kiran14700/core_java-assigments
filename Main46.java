class Brand1 {
      private String Brandname;
      private String Modelname;
      private int Topspeed;
     

      //setter method
      public void setBrandname(String Brandname) {
           this.Brandname = Brandname;
      }
      public void setModelname(String Modelname) {
           this.Modelname = Modelname;
      }
      public void setTopspeed(int Topspeed) {
           this.Topspeed = Topspeed;
      }
      //getter method
      public String getBrandname()  {
           return Brandname;
      }

      public String getModelname()  {
           return Modelname;
      }
    
      public int getTopspeed()  {
           return Topspeed; 
      }

}
public class Main46 {
    public static void main(String[] args) {
       
     Brand1 obj = new Brand1();

     obj.setBrandname("Lamborghini");
     obj.setModelname("BLaze");   
     obj.setTopspeed(200);

      System.out.println("Brand: "+ obj.getBrandname());
      System.out.println("Model: "+ obj.getModelname()); 
      System.out.println("Topspeed: "+ obj.getTopspeed());
      

       Brand1 obj1 = new Brand1();
  
       obj1.setBrandname("Lamborghini");
       obj1.setModelname("BLaze");
       
       obj1.setTopspeed(200);

       System.out.println("Brand: "+ obj1.getBrandname());
       System.out.println("Model: "+ obj1.getModelname());
       
      System.out.println("Topspeed: "+ obj1.getTopspeed());
  }
}