import java.util.*;

public class Vector3 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Kiran"); // list add method
        v.addElement("Rohit"); // vector add method

        v.addElement("Rohit"); // we can add duplicate(same) values
        v.addElement(null); // we can add null values
        v.addElement(null);

        System.out.println(v);
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.removeElement("Rohit")); // its an elemnt remover thatwshy we should write the name of the
                                                      // element
        System.out.println(v.removeElement("Rohit")); // its an elemnt remover thatwshy we should write the name of the
                                                      // element
        v.removeAllElements(); // it removes all the elements
        System.out.println(v);
        v.setElementAt("r", 2);
        System.out.println(v.capacity()); // it normal capaacity is 10 when we add values it increase from 10

    }
}
