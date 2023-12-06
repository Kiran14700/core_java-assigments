class Info1
{
        String name address;
        int age;
        void tellName(){};
        void tellAddress(){};
        void tellAge(){};
        public static void main(String args[])
        {
               info obj = new Info();
               obj.name = "George";
               obj.address = "Los Angels, USA";
               obj.age = 23;
               System.out.println("Name of the boy is:"+obj.name);
               System.out.println("Name of the boy is:"+obj.address);
               System.out.println("Name of the boy is:"+obj.age);
        }
}
 
        