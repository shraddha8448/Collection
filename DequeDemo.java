import java.util.*;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> obj = new ArrayDeque<>();

        obj.offer(10);
        obj.offer(40);
        obj.offer(20);
        obj.offer(30);

        System.out.println(obj);

        // offerFirst()
        obj.offerFirst(5);
        System.out.println(obj);

        // offerLast()
        obj.offerLast(50);
        System.out.println(obj);

        // pollFirst
        System.out.println(obj.pollFirst());
        System.out.println(obj);

        // pollLast()
        System.out.println(obj.pollLast());
        System.out.println(obj);

        // peekFirst()
        System.out.println(obj.peekFirst());
        System.out.println(obj);

        // peekLast()
        System.out.println(obj.peekLast());
        System.out.println(obj);

        // iterator
        Iterator<Integer> itr = obj.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // decendingIterator()
        Iterator<Integer> itr2 = obj.descendingIterator();
        while (itr2.hasNext()) {
            System.out.print(itr2.next() + " ");
        }
        System.out.println();
    }
}
