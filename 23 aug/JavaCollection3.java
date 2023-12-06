import java.util.*;

public class JavaCollection3 {
    public static void main(String[] args) {
        LinkedList<Integer> el = new LinkedList<Integer>();
        el.add(45);
        el.add(54);
        el.add(35);
        el.add(36);
        el.add(78);
        Iterator<Integer> itr = el.iterator();
        double sum = 0;
        int count = 0;
        double avg = 0;

        while (itr.hasNext()) {
            int element = itr.next();
            sum = sum + element;
            count++;
        }
        if (count > 0) {

            avg = sum / count;
            System.out.println("Average of Linked List : " + avg);

        } else {
            System.out.println("Linked list is Empty");
        }

    }
}