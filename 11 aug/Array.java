public class Array
    {
    public static void main(String args[])
       {
         int [][]b={{1,2,3},
                    {4,5,6}};
         int [][]c={{4,5,6},
                    {7,7,10}};
         int[][]res={{0,0,0},
                    {0,0,0}};
                                
         for(int i=0;i<b.length;i++)
          {
            for(int j=0;j<b[i].length;j++) 
               {
                  res[i][j]= b[i][j] + c[i][j];
                  System.out.print(res[i][j]+" ");  
                  
               }
            System.out.println("");
          }
     }
 }                                 
     

         
         
 
        
        
      