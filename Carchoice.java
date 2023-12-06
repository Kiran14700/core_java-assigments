import java.util.Scanner;
class Carchoice
{
 public static void main(String args[])
 {
 string=cust_name,car,brand,color;
 Scanner sc=new Scanner(System.in);
 System.out.println("Whats your name sir");
 cust_name=sc.nextLine();
 System.out.println("Emter the brand of the car");
 brand=sc.nextLine();


 System.out.println("Enter Color of car you want");
  color=sc.nextInt();

 switch(color)
 {
 case "blue":
      
       System.out.println("Congraluations"+cust_name+ " sir you purchased your dream car " +color+"colour"+car_brand);
       break;
 case "red":
      
       System.out.println("Congraluations"+cust_name+ " sir you purchased your dream car " +color+"colour"+car_brand);
       break;
 case "white":
       
       System.out.println("Congraluations"+cust_name+ " sir you purchased your dream car " +color+"colour"+car_brand
 case "black":
       
       System.out.println("Congraluations"+cust_name+ " sir you purchased your dream car " +color+"colour"+car_brand);
       break;

 default:
       System.out.println("Sorry sir your choice of car color is not available");
       break;
}
}
}