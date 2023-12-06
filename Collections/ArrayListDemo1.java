import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList ar = new ArrayList();
        // Arratlis have preddefined index size which is 10 and we can set size
        ArrayList ar2 = new ArrayList(20);
        // System.out.println(ar2.());

        // we can add values through index posiiton

        ar.add(10);
        ar.add(0, 20);
        ar.add(30);
        ar.add(40);
        ar.add(50);
        System.out.println(ar);

        // we can store different data types in arraylist because it is an heterogneous
        // type

        ar.add(50);
        ar.add("Kiran");
        ar.add(50.00);
        System.out.println(ar);

        // we can store duplicate(same) values

        ar.add(10);
        ar.add(10);
        ar.add(null);
        ar.add(null);
        System.out.println(ar);

        // arraylist folllow insertion order means the value we add it print linewise
        // it not follows sorting order means first small value come then large value

        ArrayList a12 = new ArrayList<>();
        a12.addAll(ar); // we can add one arraylist elemnts to anotheir elemnts
        System.out.println(a12);
        a12.remove(0); // we can remove values to thier index position
        System.out.println("remove" + a12);

        ArrayList a13 = new ArrayList();
        a13.add(10);

        a12.removeAll(a13); // this method remves the elemnts which are present in anotheir element
        System.out.println(a12);
        System.out.println(a12.contains("Kiran")); // it check the elements which is written is present or not and
                                                   // return value in boolean
        System.out.println(a12.size()); // it check how much elemnts is present

        System.out.println(a12.get(2)); // it gives the value according to index position
        System.out.println(a12.set(4, "Rohit")); // we can set values according to index

        System.out.println("Index position of  Rohit is : " + a12.indexOf("Rohit")); // it provides index psotion
                                                                                     // according to
        // index
        // position
    }
}
