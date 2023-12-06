// import java.io.FileInputStream;

// public class exception {
//     public static void main(String[] args) {
//         //by using try catch it compiles but file is not present there thatwhy it gives                                                                                                    // 
//         try{
//         FileInputStream s=new FileInputStream("D:/abc.txt");
//         }
//         catch(Exception e){
//         System.out.println(e);        

// //     }
// // }
// // }


import java.io.FileInputStream;

public class exception {
    public static void main(String[] args)
    
    
    // {
        
    //  int a=100, b=0, c;
    //  c=a/b;
    //  //in this tinme compiler compiles the program withour give ann error
    //  //because this exception is an arithmetic exception
    //  //unchecked exception or runtime excdeption
        


    // //  System.out.println(c);
    // String name=null;
    // System.out.println(name.length());       //it throwes nullpointerexception      //unchecked exception

    // }





    {
    try{
        int a=100,b=0,c=a/b;       //riskycode
        System.out.println( c);

    }
    catch(Exception e){
        System.out.println(e);
        System.out.println("Your code is not proper ");
    }
    System.out.println("hello");   //if it print it means ur code is run and exception handling is solve the error problem

    

    
}







}

