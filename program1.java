// Generics with collection
import java.util.*;
public class program1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("str");
        arrayList.add(10);
        arrayList.add(30);
        arrayList.add(80);

        int a = (int)arrayList.get(2);
        System.out.println(a);
    }
}
