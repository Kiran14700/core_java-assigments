import java.util.Scanner; //Scanner object is imported
class DonateBlood
 {
  public static void main(String args[])
   {
    int age,weight;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the age of the person:");
    age=sc.nextInt();
    System.out.println("Enter the weight of the person:");
    weight=sc.nextInt();
    //logics for the given conditions

    if(age>18)
    { 
      if(weight>50)
      System.out.println("The person can donate the blood");
    }

    else
    {
    System.out.println("The person cannot donate the blood");

    }
  }
}