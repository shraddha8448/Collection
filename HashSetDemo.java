import java.util.*;

class HashSetDemo{
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        //add()
        hs.add("Tamvi");
        hs.add("Mansi");
        hs.add("Nirupama");
        hs.add("Disha");
        hs.add("Shraddha");

        System.out.println(hs);

        // size()
        System.out.println(hs.size());

        // contains()
        System.out.println(hs.contains("Disha"));

        // isEmpty()
        System.out.println(hs.isEmpty());

        // clear()
        hs.clear();
        System.out.println(hs);
    }
}