import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        //add()
        lhs.add("Tamvi");
        lhs.add("Mansi");
        lhs.add("Nirupama");
        lhs.add("Disha");
        lhs.add("Shraddha");

        System.out.println(lhs);
    }
}
