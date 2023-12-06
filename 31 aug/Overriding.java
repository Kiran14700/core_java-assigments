// class Test
// {
//     //Simple meaning of overriding its same method we can run by creating differenet classes its only applied in ineritance
//     void Show(int a)
//     {
//         System.out.println("1");
//     }
// }

//  class Overriding extends Test
//  {
 
//     void Show(int a)
//     {
//         System.out.println("2");
//     }
//         public static void main(String[] args) 
//         {
//             Test t=new Test();
//             t.Show(4);
//             Overriding n=new Overriding();
//             n.Show(4);
//     }
// }


//before 1.4 version there is no return type but in the updated version wse changr return type in java 
//its called covariant returntye
class Test
{
    //we use object
     void Object(int a)
    {
        System.out.println("1");
        return ;
    }
}

 class Overriding extends Test
 {
     
    void  Integer(int a)
    {
        System.out.println("2");
        return ;
    }
        public static void main(String[] args) {
       
            Test t=new Test();
            t.Object(4);
            Overriding t1=new Overriding();
            t1.Integer(4);
    }
}
