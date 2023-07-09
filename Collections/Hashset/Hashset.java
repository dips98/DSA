package Collections.Hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashset {
    public static void main(String[] args) {

        // it uses hasing bucket for storing the data
        // Duplicates not allowed
        // load factor is 0.75
        HashSet hs = new HashSet();
        hs.add(1);
        hs.add(10);
        hs.add(20);
        hs.add(95);
        hs.add(95);
        hs.add(200);
        System.out.println(hs);


        //  it will follow the order of insersion
        LinkedHashSet hs1 = new LinkedHashSet();
        hs1.add(1);
        hs1.add(20);
        hs1.add(20);
        hs1.add(35);
        hs1.add(95);
        hs1.add(200);
        System.out.println(hs1);
    }
}
