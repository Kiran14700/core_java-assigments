//Autoboxing and unautoboxing
class Autoboxing
   {
     public static void main(String args[])
       {
         int x=25,y;
         Integer val=new Integer(x);//Autoboxing
         y=val;//unboxing
         System.out.println("Value after"+val);
          System.out.println("Value before"+y);
       }
   }
  