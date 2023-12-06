public class finally1 {
public static void main(String[] args) {
    try{
        int a=100,b=2,c;
        c=a/b;

    }
   catch(Exception e){
    System.out.println(e);

}
finally{
    System.out.println("I am in finally block");         //this finally block will execute evn if try not appear or catch not appear    // even if we use only try method then alos it will run

}

//     try{
//         int a=100,b=2,c;
//         c=a/b;

//     }


// finally{ 
//     System.out.println("I am in finally block");        //thie  line will print firstthen the error code appeared because finally is implement even if the error is sppearede

// }

}

}
