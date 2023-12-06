class Customergetset {
      private String Custname;
      private String Productname;
      private int ProductQuantity;
      private int TotalAmount;
     

         //setter method
         public void setCustname(String Custname) {
           this.Custname = Custname;
          }
          public void setProductname(String Productname) {
           this.Productname = Productname;
          }
          public void setProductQuantity(int ProductQuantity) {
           this.ProductQuantity = ProductQuantity;
          }
          public void setTotalAmount(int TotalAmount) {
           this.TotalAmount = TotalAmount;
          }
                //getter method

                 public String getCustname()  {
                   return Custname;
                 }
                 public String getProductname()  {
                   return Productname;
                 }  
                 public int getProductQuantity()  {
                   return ProductQuantity; 
                 }
                public int getTotalAmount()  {
                   return TotalAmount; 
                 }

             }
                      public class Detailscust {
                             public static void main(String[] args) {
       
                            Customergetset obj1 = new Customergetset();

                           obj1.setCustname("Bheem");
                           obj1.setProductname("Ghadah");   
                           obj1.setProductQuantity(1);
                           obj1.setTotalAmount(2000);


                          System.out.println("Name of the customer: "+ obj1.getCustname());
                          System.out.println("Name of the product: "+ obj1.getProductname()); 
                          System.out.println("Total quantity of the products: "+ obj1.getProductQuantity());
                          System.out.println("Amount of the products: "+ obj1.getTotalAmount()); 
                          System.out.println("__________________________");

                          Customergetset obj2 = new Customergetset();
  
                         obj2.setCustname("Hritik roshan");
                         obj2.setProductname("Fair handsome");   
                         obj2.setProductQuantity(5);
                         obj2.setTotalAmount(200);



                        System.out.println("Name of the customer: "+ obj2.getCustname());
                        System.out.println("Name of the product: "+ obj2.getProductname()); 
                        System.out.println("Total quantity of the products: "+ obj2.getProductQuantity());
                        System.out.println("Amount of the products: "+ obj2.getTotalAmount()); 

           
  
                   }
        }