public class pub {
    // /* */ static int add(int...arr) {
    // int result=0;
    // for(int a:arr)
    // result +=a;
    // }
    // return result;


    // Factorial method java recursion
    static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
         else {
            return n * fact(n - 1);
        }
    }
    static int fact_iterative(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
         else {
            int product=1;
            for(i=1;i<=n;i++){              
                                                                                                                       
                product+=i;
            }
            return product;
        }
    }

    public static void main(String args[]) {
        int x = 1;
        System.out.println("the vlue of fctoril is:" + fact(x));
        System.out.println("the vlue of fctoril is:" + fact_iterative(x));

        // //this will call the first add method
        // System.out.println("Sum of two numbers: "+add(10, 20));
        // //this will call the second add method
        // System.out.println("Sum of three numbers: "+add(10, 55, 20));
        // //this will call the third add method
        // System.out.println("Sum of four numbers: "+add(10, 20,30,40));
    }
}