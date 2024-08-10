import java.util.ArrayList;

public class program2 {
    public static void main(String[] args) {
        // generics
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
       // ArrayList<int> arrayList1 = new ArrayList<int>(); .....it gives error because we cannot used primitive data types
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        int a = arrayList.get(2);
        System.out.println(a);
    }
}
