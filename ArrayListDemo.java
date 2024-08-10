// ArrayList

import java.util.*;

public class ArrayListDemo{
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();

        // add()
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(20);
        al.add(50);

        // size()
        System.out.println(al.size());

        // contains()
        System.out.println(al.contains(100));
        System.out.println(al.contains(10));

        // indexOf()
        System.out.println(al.indexOf(30));

        // lastIndexOf()
        System.out.println(al.lastIndexOf(20));

        // get()
        System.out.println(al.get(3));

        // set()
        al.set(3, 10);

        // remove()
        al.remove(3);

        // addAll(Collection)
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(50);
        al2.add(60);
        al2.add(70);

        al.addAll(al2);

        // toArray()
        Object arr[] = al.toArray();
        for(Object data : arr){
            System.out.print(data + " ");
        }
        System.out.println();

        // isEmpty()
        System.out.println(al.isEmpty());

        // iterator()
        Iterator<Integer> itr = al.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        
        // clear()
        al2.clear();
        System.out.println(al2);
    }
}