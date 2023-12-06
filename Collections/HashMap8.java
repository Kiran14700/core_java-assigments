import java.util.*;

public class HashMap8 {
    public static void main(String[] args) {
        // HashMap hm = new HashMap();
        // hm.put(101, "Kiran");
        // hm.put(102, "Roiht");
        // System.out.println(hm);

        // its an old method

        // Set set = hm.entrySet(); // convert hashmap to set
        // System.out.println(set); //this method we use to see values of map in set see
        // the curly brace or square bracket

        // Iterator itr = set.iterator(); // we cant use iterator on hashmap
        // while (itr.hasNext()) {
        // // System.out.println(itr.next()); //its an old
        // Map.Entry entry = (Map.Entry) itr.next(); // its an interface by using this
        // we can separetely see key and
        // // value

        // System.out.println(entry.getKey() +"->"+entry.getValue()); //entry is an
        // interface of map by using get we see both values and key elements separetely
        // }

        // we use for each loop

        HashMap<Integer, String> hm = new HashMap();
        hm.put(101, "Kiran"); // if we change value we get erro because we set generic integer and String
        hm.put(102, "Roiht");
        System.out.println(hm);
        for (Map.Entry me : hm.entrySet()) // we get error so we use generics
        {
            System.out.println(me.getKey() + "  " + me.getValue());
        }

    }
}
