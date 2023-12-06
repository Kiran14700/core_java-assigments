import java.util.Scanner;
class Elect2
{
//Program to calculate the electricity bill

  public static void main(String args[])
  {
  int unit,ebill;    //Declaration of variables
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter the units of Electricity");
  unit=sc.nextInt();  //Value store in variable


  if(unit>=1 && unit<=100)  //used AND operation
  {

  ebill=unit*10;
  System.out.println("You are consumed: " +unit+ "Units");
  System.out.print("You should pay Rs:" +ebill+ " for the Electricity Bill");
  }
  else if(unit>100 && unit<=200)
  {
  ebill=(100*10)+(unit-100)*15;
  System.out.println("You are consumed: " +unit+ "Units");
  System.out.print("You should pay Rs:" +ebill+ " for the Electricity Bill");
  }
  else if(unit>200 && unit<=300)
  {
  ebill=(100*10)+(100*15)*(unit-200)*20;
  System.out.println("You are consumed: " +unit+ "Units");
  System.out.print("You should pay Rs:"+ebill+" for the Electricity Bill");
  }
  else if(unit>300)
  {
  ebill=(100*10)+(100*15)+(100*20)+(unit-300)*25;
  System.out.println("You are consumed: " +unit+ "Units");
  System.out.print("You should pay Rs:"+ebill+ " for the Electricity Bill");
  }
  else
  {
  System.out.print("error");
  } 
 }
}