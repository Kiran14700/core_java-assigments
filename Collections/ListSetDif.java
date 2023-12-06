import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ListSetDif {
    public static void main(String[] args) {
        List l = new ArrayList();
        // list me positon insert krnih hotih ha agar 0 index me value add na ho aur
        // agar ham fir ya 2 index ma value add krnegeh toh error ayaega
        l.add(0, 10); // we can add elemnts in list thorugh index position
        l.add(1, 20); // list followe index postion rule means elemnts order meh print honge according
                      // ot thier positons
        l.add(2, 30);
        l.add(3, 50);
        System.out.println("List l" + l);

        // if we not declare values in first index positon i.e(0) and try to add elemts
        // in other index then we got error indexoutofbound exsception

        // but in set
        // ham index position nhi liktah
        // set apneapp values ko add krta hai

        Set s = new HashSet();
        s.add(20); // but in set woh index order meh print nhi hogenh
        s.add(30);
        s.add(40);
        s.add(50);
        System.out.println("Set s" + s);

        // in list we can add duplicate(same) elements
        // but in set we can't add duplicate(same) elements
        List d = new ArrayList();
        d.add("Kiran");
        d.add("Kiran");
        d.add(null); // similar in null case
        d.add(null);
        System.out.println(d);

        Set t = new HashSet<>();
        t.add("Rohit");
        t.add("Rohit");
        t.add(null); // it cant print smae null values
        t.add(null);

        System.out.println("Set t" + t); // see only one elemnt wil print it ignores the other element

        // when we use iterator it prints elemnent 1 by 1

        java.util.Iterator itr = l.iterator();
        java.util.Iterator itr2 = t.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next()); // if we not use next it goes on loop
        }
        while (itr2.hasNext()) {
            System.out.println(itr2.next()); // if we not use next it goes on loop
        }

        // there is only listiterator is available setIteration is not
        ListIterator litr = d.listIterator();
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

        while (litr.hasNext()) {
            System.out.println(litr.previous()); // it order from bottom to top
        }

    }
}
