import java.util.Scanner; //Scanner object is imported
class Leapyear
{
  public static void main(String args[])
  {
  int a;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a year:");
  a=sc.nextInt();

  //logics for the given conditions
  //2016,2020,2024

  if((a%4==0 && a%100!=0)||(a%400==0))
  { 
  System.out.println("This year is leap year");
  }
  else{
  System.out.println("This year is not a leap year");

  }
 }
}