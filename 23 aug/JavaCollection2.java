import java.util.*;
public class JavaCollection2
     {
        public static void main(String[] args) {
            LinkedList<String> el=new LinkedList<String>();
            el.add("Ramesh");
            el.add("Vijay");
            el.add("avi");
            el.add("jay");
            Iterator<String> itr=el.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }
        }
     }