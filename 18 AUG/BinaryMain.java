/* import created package to find particular element
 from the array using binary search algorithm */

import MyArray.Binary;  //importing MyArray package from class Binary
import java.util.Scanner;
class BinaryMain        //declaring class
   {    
         public static void main(String[] args)
          {
         Scanner sc=new Scanner(System.in);   //Scanner object is declared                 
         Binary obj = new Binary();  //Creating object of the class 
        
         obj.Accept();     //process object from the package

         //Declaring variables
         int li = 0;
         int hi = obj.arr.length-1;
         int mi = ((li+hi)/2);         
         int search;        
         System.out.println("Enter the number you want to find : ");  //asking input to enter the element that input want to find
         search=sc.nextInt();

           //The process of array to find the element input enter 
            while(li<=hi)    
                {   
                  //if element is on the middle index then this process run                      
                  if(obj.arr[mi]==search)
                     {                
                       System.out.println("The element is present at "+mi+ " Position");
                       break;
                     }
                   //if element is on the lower index then this process run  
                  else if(obj.arr[mi]<search)
                     {
                       li= mi+1;
                     }
                   //if element is on the higher index then this process run  
                  else
                     {
                       hi = mi-1;
                     }
                   mi = ((li+hi)/2);                   
               }
         }    
   }