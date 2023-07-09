package Collections.Iterators;

import java.util.ArrayList;

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

    }
}
