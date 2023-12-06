import java.util.HashMap;
import java.util.Map;

public class Map7 {
  public static void main(String[] args) {
    Map m = new HashMap<>();
    m.put(101, "deepak"); // key must be unique //we can use null one time in key
    m.put(102, "Kirn"); // but in value we add duplicate values
    m.put(103, "lepak");
    m.put(104, "Manish");
    m.put(104, "Akshat"); // if we already declared key value and repeatedly use it then the value will
                          // change and present value will declared

    System.out.println(m);
    System.out.println(m.containsKey(103)); // it will check the key is presnt or not
    System.out.println(m.containsValue("deepak")); // it will check the value is presnt or not
    System.out.println(m.get(102)); // it will get the value thorugh key
    System.out.println(m.get(110)); // if we write method which is not presnt in the key then we got null value in
                                    // return
    Map n = new HashMap<>();
    n.put(106, "Rathod");
    n.putAll(m); // we can add other object value to anothier one
    System.out.println(m.remove(101)); // it will remove the object which we enter
    System.out.println(m.size()); // it will check how many elements in the object
    System.out.println(m.replace(101, "Kiran")); // it will replace the object which we enter

    System.out.println(m.isEmpty()); // check any value is their or not

    m.put(null, "aaa");
    m.put(null, null); // if we rewrite the key name then it use current one /.

  }
}
