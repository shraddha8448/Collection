import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
    
        Vector<Integer> v = new Vector<>();

        // addElement()
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(50);

        System.out.println(v);

        // capacity()
        System.out.println(v.capacity());

        // indexOf
        System.out.println(v.indexOf(30));

        // lastIndexOf()
        System.out.println(v.lastIndexOf(40));

        // elementAt()
        System.out.println(v.elementAt(2));

        // get()
        System.out.println(v.get(4));

        // setElementAt()
        v.setElementAt(80,4);
        System.out.println(v);

        // remove
        v.removeAllElements();
        System.out.println(v);
    }
}
