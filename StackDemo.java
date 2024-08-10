import java.util.*;
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        
        // push()
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println(s);

        // pop()
        System.out.println(s.pop());
        System.out.println(s);

        // peek()
        System.out.println(s.peek());
        System.out.println(s);

        // search()
        System.out.println(s.search(30));

        // empty()
        System.out.println(s.empty());
    }
}
