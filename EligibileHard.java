/*WAP to check whether the person is eligible for getting loan or not.
Condition to grant loan is he should have more than salary more than 50000 and he should be citizen of INDIA.
othetwise loan can't be given to customer. */

import java.util.Scanner;   //Scanner class is imported
class EligibileHard         //class name is given
  {
    public static void main(String args[])
      {
       int a,b,In;      //Varible declaration
       Scanner sc=new Scanner(System.in);    //Scanner object is executed 
       //Asking input enter the loan amount
       System.out.println("How much loan you required: ");
       a=sc.nextInt();
       //Asking input enter salary
       System.out.println("What is your salary: ");
       b=sc.nextInt();
       //Asking input enter here indian or not
       System.out.println("If you are indian press.1 not press.2");
       In=sc.nextInt();
        //check if the salary is greater than 50000
       if(b>50000)
        {
        //
         switch(In)
          {
           //if user press.1 then this case run
           case 1:
                  System.out.println("you are eigible for the loan");
                  break;
            //if user press.2 then this case run
           case 2: 
                  System.out.println("you are not eligible for the loan because you are not an indian");
                  break; 
           //if all cases not match then this default will run
           default:
                  System.out.println("You are not eligble for the loan because your salary:"+a+" is less than 50000");
                  break;
           }
        }
     }
 }