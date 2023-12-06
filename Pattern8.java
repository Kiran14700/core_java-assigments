class Pattern8
     {
        public static void main(String args[])
           {

           //upper part
           for(int i=1;i<=5;i++)
              {
               //for 1st star
               for(int j=1;j<=i;j++)
                 {
                    System.out.print("* ");
                 } 
                       //for spacing
                       int space=2*(5-i);
                       for(int k=1;k<=space;k++)
                          {
                              System.out.print(" ");
                          }
             //Laast staar
                for(int l=1;l<=i;l++)
                   {
                      System.out.print("* ");
                   }
            System.out.println();
        
       }
             //lower part
             for(int i=5-1;i>=1;i--)
                {
                  for(int j=1;j<=i;j++)
                    {
                      System.out.print("* "); 
                    }
                       //for spacing
                       int space=2*(5-i);
                       for(int k=1;k<=space;k++) 
                            {
                               System.out.print(" ");
                            }
                      //Laast staar
                  for(int l=1;l<=i;l++)
                    {
                       System.out.print("* ");
                    }
                 System.out.println();
               }
         }
   }  
     


