import java.util.Enumeration;
import java.util.Vector;

public class Enumer {
    public static void main(String[] args) {
        Vector vi = new Vector();
        vi.add(10);
        vi.add(20);
        vi.add(30);
        vi.add("Kiran");
        System.out.println(vi);

        // Enumeration is same as iterator but we use it only in vector and stack or
        // legacy class
        Enumeration e = vi.elements();// to add vector in enumeration we should use
        // elemnts

        while (e.hasMoreElements()) // it return boolean values thatswhy we put it on while loop
        {

            System.out.println(e.nextElement()); // we use next elemnt to run the object
        }

    }
}
