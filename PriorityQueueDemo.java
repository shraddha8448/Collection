import java.util.*;
public class PriorityQueueDemo{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(20);
        pq.offer(10);
        pq.offer(50);
        pq.offer(30);
        pq.offer(40);

        System.out.println(pq);

        // peek
        System.out.println(pq.peek());
        System.out.println(pq);

        // poll
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}