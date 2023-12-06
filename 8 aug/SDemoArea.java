import 
java.util.Scanner;
 class SDemoArea {

    //static variable
    static double pi=3.14;
    double area;
    int r;
    Scanner sc=new Scanner(System.in);
    public static void accept()
    {
     System.out.print("hello");
    }

    public void calculate()
    {
 
    System.out.println("Enter radius");
    r=sc.nextInt();
      area=pi*r*r; 
      System.out.println("The area of circle is"+area);
    }

     public static void main(String args[])
         {
          SDemoArea obj=new SDemoArea();
          SDemoArea.accept();
          obj.calculate();
         }
  
}
