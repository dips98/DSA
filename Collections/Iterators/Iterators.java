package Collections.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(14);
        ar.add(34);
        ar.add(54);
        ar.add(43);
        ar.add(23);
        ar.add(90);
        ar.add(75);
        ar.add(99);
        System.out.println(ar);
        System.out.println("---This is using simple For loop---");
        // printing through for loop
        for (int i = 0; i < ar.size(); i++) {
            // Object o = ar.get(i);
            // System.out.println(o);
            System.out.println(ar.get(i));
        }
        System.out.println("---This is using For each loop---");
        //  For each loop
        for (Object i : ar) {
            System.out.println(i);
        }

        System.out.println("---This is using iterator---");
        Iterator it = ar.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("---Using List Iterator---");
        ListIterator lit = ar.listIterator(ar.size());
        while(lit.hasPrevious()){
            System.out.println(lit.previous());
        }
    }
}
