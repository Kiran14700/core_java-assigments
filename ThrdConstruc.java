// class Construct1 extends Thread {
//     Construct1(String name, int id) {
//         super(name);

//     }

//     public void run() {
//         int i = 0;
//         while (i > 10) {
//             System.out.println("i m  thred");
//         }
//     }
// }

// public class ThrdConstruc {
//     public static void main(String[] args) {
//         Construct1 t1 = new Construct1("Kirn", 75);

//         t1.start();

//         // System.out.println("The id of the thred t is: "+t1.getId());
//         System.out.println("The name of the thred t is: " + t1.getName());
//         System.out.println("The name of the thred t is: " + t1.getId());
//     }
// }


class Construct1 extends Thread{
    Construct1(String name)
    {
        super(name);
    }

    public void run()
    {
        int i=0;
        while(i>10){
            System.out.println("kirn");

        }

    }
}
    public class ThrdConstruc{
        public static void main(String[] args) {
            Construct1 t1=new Construct1("Vij ay");
            t1.start();
            System.out.println("The id of "+t1.getName());
            System.out.println("get id"+t1.getId());
            

        }
    }

    
    

    

