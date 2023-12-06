//WAP to check Whether the number is Armstrong number or not using class and object concept.

import java.util.Scanner; //Scanner object is imported
class Armstrong        //class declared
 {  
  int num,rem,res=0,input;       //variable declaration
  Scanner sc=new Scanner(System.in);

           public void Accept()   //accepting number
            {
             System.out.println("Enter a number: ");   //accepting number from input
             num=sc.nextInt();
             input=num;
            }
           public void Process()        //the number process
           {
             while(num>0)            //while loop checks the condition if its true then its process
              {
               rem=num%10;
               res=res+(rem*rem*rem);
               num=num/10;
              }
           }
           public void Display()    //in this the result display
           {
              if(input==res)       //if it equals then the number is armstrong otherwise not
              {
                 System.out.println("The number is Armstrong number");
              }
              else
              {
                 System.out.println("The number is not an Armstrong number");
              }
          }
    }  

 public class Armstrong1
   {
      public static void main(String args[])      //main method
      {
       Armstrong obj =new Armstrong();           //class object is created

       obj.Accept();                             //class object method is called                                   
       obj.Process();
       obj.Display();            
       }
    }

