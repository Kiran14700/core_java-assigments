import java.util.*;;

public class HashSet5 {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();
        hs.add("kiran");
        hs.add("kiran"); // hash set doesnt follow duplicate values
        hs.add(10.55); // hashset dosent follow insertion order
        hs.add(50);
        hs.add(null);
        hs.add(null); // see it not add duplicate values
        System.out.println(hs);

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        System.out.println(hs); // it doesnt follow sorting order

        // we can use iterator

        Iterator itr = hs.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        // we can add list values to hashset by constructor

        ArrayList al = new ArrayList<>();
        al.add("Lohar");
        al.add("Lohar");
        al.add("Lohar");
        HashSet hs2 = new HashSet<>(al);
        System.out.println(hs2);
        al.addAll(hs2);
        al.addAll(2, hs);
        System.out.println(al);
        al.clear();
        System.out.println(al);
        al.remove("Lohar");
        System.out.println(al.contains("lo"));
        al.size();
        System.out.println(al);

    }
}
