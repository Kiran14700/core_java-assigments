import java.util.*;

public class LinkedList3 {

    public static void main(String[] args) {

        LinkedList<String> Lang = new LinkedList<String>();
        Lang.add("Javascript");
        Lang.add("C#");
        Lang.add("Python");
        Lang.add("MongoDB");
        Iterator<String> itr = Lang.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("The first Language in the list is: " + Lang.get(0));

        // Update element
        Lang.set(3, "Java");
        System.out.println("After Modified LanguageList: " + Lang);

        // remove particular element
        String removedElement = Lang.remove(2);

        System.out.println("Updated LanguagedList: " + Lang);
        System.out.println("Removed Language: " + removedElement);

    }
}
