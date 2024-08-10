import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> hm = new LinkedHashMap<>();

        // put()
        hm.put(3, "Mansi");
        hm.put(2, "Tanvi");
        hm.put(1, "Disha");
        hm.put(4,"Nirupama");

        System.out.println(hm);

        // get()
        System.out.println(hm.get(3));

        // containsKey()
        System.out.println(hm.containsKey(1));
        System.out.println(hm.containsKey(7));

        // containsValue()
        System.out.println(hm.containsValue("Disha"));

        // size()
        System.out.println(hm.size());

        // isEmpty()
        System.out.println(hm.isEmpty());

        // values()
        System.out.println(hm.values());

        // keySet()
        System.out.println(hm.keySet());

        // remove()
        hm.remove(2);
        System.out.println(hm);

        // replace()
        hm.replace(4, "Nirupama", "Shraddha");
        System.out.println(hm);

        // clear()
        hm.clear();
        System.out.println(hm);
    }
}
