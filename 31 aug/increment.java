
// public class increment {
//     public static void main(String arg[])
//     {
//     int p = 5;
//     int q = 2;
//     int r;
//     int s;
// r = ++q;
// s = p++;
// r++;
// System.out.println("p = " + p + " q = " + q + " r = " + r + " s = " + s);
// }
// }
public class increment{
    public static void main(String[] args) {
        int n=158,rev=0,rem,count;;
     while(n>0){
       
     
             rem=n%10;
             rev=rev*10+rem;
             n=n/10;
    

     }
             System.out.println("the reverse of"+rev);

    }
}
