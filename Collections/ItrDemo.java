import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class ItrDemo {
    public static void main(String[] args) {
        List l = new ArrayList<>();
        l.add("kiran");
        l.add("Siddhesh");
        l.add("Rohit");
        ListIterator litr = l.listIterator();

        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

        // previous works from backward to forward
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
        l.remove(1); // it removes elments thorught their index psositon
        System.out.println(l);
        l.set(1, "Tunisia"); // we can set elements thorgh index position
        System.out.println(l);

    }
}