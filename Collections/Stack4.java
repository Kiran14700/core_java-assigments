import java.util.Stack;

public class Stack4 {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push("kiran"); // we can use push or add method to insert elemnt sin the stack
        s.add("kiran");
        s.push(40);
        s.push(50.00);
        System.out.println(s);
        System.out.println(s.pop()); // it removes the object which is present in top of the stack and in stack which
                                     // element we are insert in the last are the top elment(lifo) method last in
                                     // first out
        System.out.println(s);
        System.out.println(s.peek()); // it checks which object is in the peak means last object and in stack last
                                      // onject is the first object

        System.out.println(s.search("kiran")); // it search the elenent and return the value in topmost
        // positon
        System.out.println(s.search(40.0)); // if element is not present it return value in -1

    }
}
