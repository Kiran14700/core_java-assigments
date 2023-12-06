import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedList1 {
    public static void main(String[] args) {
        // we can use linkedlist in list or deque

        LinkedList li = new LinkedList<>();
        li.add("Kiran");
        li.add(10);
        li.add(50.125);
        li.add("Kiran");
        System.out.println(li);
        // linkedlist similar to list
        // we can add same types of values like string or int
        // we can add duplicate(same) values similar to null
        // it is an index based structure meansa first row is 0 index psotion second is
        // 1
        // they are not synchronied means not an thread stopper

        // we have some method which arer in linked lsit

        li.addFirst("aaa"); // it add the elements to the first index and other elemnts go to 1 + down
        System.out.println(li);

        li.removeFirst(); // it remove the elements to the first index
        System.out.println(li);

        li.addLast("bbb"); // it add the elements to the Last index and other elemnts go to 1 - upward
        System.out.println(li);

        li.removeLast(); // it removes the elements to the Last index

        System.out.println(li);

        // by the help of constructor we can add arralist elment sto linkedloist

        ArrayList ai = new ArrayList();
        ai.add("Dinesh");
        ai.add("Dinesh");
        ai.add("Dinesh");
        ai.add("Dinesh");

        LinkedList li2 = new LinkedList(ai);
        System.out.println(li2); // by inserting arraylist element to liked list we can use linked list method to
                                 // this values

    }
}
