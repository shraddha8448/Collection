
import java.util.*;
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        //add()
        ts.add("Tanvi");
        ts.add("Mansi");
        ts.add("Nirupama");
        ts.add("Disha");
        ts.add("Shraddha");

        System.out.println(ts);

        // first()
        System.out.println(ts.first());

        // last()
        System.out.println(ts.last());

        // lower()
        System.out.println(ts.lower("Disha"));

        // floor()
        System.out.println(ts.floor("Mansi"));

        // ceiling()
        System.out.println(ts.ceiling("Mansi"));

        // heigher()
        System.out.println(ts.higher("Nirupama"));

        // pollFirst()
        System.out.println(ts.pollFirst());

        // pollLast()
        System.out.println(ts.pollLast());

        // clear()
        ts.clear();
        System.out.println(ts);
    }
}
