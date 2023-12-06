public class Global {
   
        //It is accessible in any method or fucntionoing in this class 
        int GlobalVariable=2;

        //this is static variable
        static int staticVariable=1;

        public void something(){
            //it is accessible only for this method out sid eof method it is not accessible
            int localVariable=0;
        System.out.println(GlobalVariable);
        System.out.println(staticVariable);
        System.out.println(localVariable);

        }
    }
    

