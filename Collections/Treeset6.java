import java.util.TreeSet;

public class Treeset6 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        TreeSet ts2 = new TreeSet<>();
        ts.add(10);
        ts.add(20);
        ts.add(30); // treeset follows sorting order thatwshy are in order
                    // 10 11 12
        System.out.println(ts);

        // but if we add different types then got erroe
        // because treeset is an homogenpus data type
        ts2.add("Kiran");
        ts2.add("Miran");
        ts2.add("Hiran");
        ts2.add("giran");
        System.out.println(ts2);

        System.out.println(ts.comparator());
        ts.descendingSet();
        System.out.println(ts.descendingSet());
        // we can see mor method

    }
}
