import java.lang.reflect.Array;
import java.util.ArrayList;

public class arraList1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>(); // obj created
        al.add("Deepak");
        al.add("Fayaz");
        al.add(101);
        System.out.println(al);

        ArrayList a2 = new ArrayList<>(); // obj created
        a2.add("Ankit");
        a2.add("Manish");
        a2.add(102);
        System.out.println(al);

        al.addAll(a2); // it will add all the objects
        // a2 ke saare elements al ka andhr add ho rah ha
        System.out.println(al);
        System.out.println(al.add("a")); // we can directly add the objects
        System.out.println(al.contains("Manish")); // it teels the object is present or not and return value in boolean
        System.out.println(al.isEmpty()); // it checks object have values or not and return value in boolean
        System.out.println(al.size()); // it teels how many elements in the object
        System.out.println(a2.size()); // it teels how many elements in the
        System.out.println(al.remove(4)); // it removes the objet through index position
        System.out.println(al.removeAll(a2)); // it removes all the elemts of object(a2) from al
        System.out.println(al);
        al.clear(); // it will clear all the elemnts from th eobject , its an method tahwthy we can
                    // write it on sysout

        System.out.println(al);
    }
}