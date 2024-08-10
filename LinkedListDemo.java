import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        // add()
        ll.add(10);
        ll.add(20);
        ll.add(30);

        System.out.println(ll);

        // addFirst()
        ll.addFirst(5);
        System.out.println(ll);

        // addLast()
        ll.addLast(40);
        System.out.println(ll);

        // addAll(Collection)
        ArrayList<Integer> al = new ArrayList<>();
        al.add(50);
        al.add(60);
        al.add(70);

        ll.addAll(al);
        System.err.println(ll);

        // size()
        System.out.println(ll.size());

        // contains()
        System.out.println(ll.contains(40));

        // getFirst()
        System.out.println(ll.getFirst());

        // getLast()
        System.out.println(ll.getLast());

        // removeFirst()
        System.out.println(ll.removeFirst());
        System.out.println(ll);

        // removeLast()
        System.out.println(ll.removeLast());
        System.out.println(ll);
    }
}
