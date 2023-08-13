package MapAndGenerics;

import java.util.*;

public class MapUsedCase {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(1, "Sam");
        hm.put(2, "Dam");
        hm.put(3, "Cam");
        hm.put(4, "Lam");
        hm.put(5, "Pam");
        hm.put(6, "Nam");
        hm.put(7, "Iom");
        hm.put(7, "Ivan");

        System.out.println(hm.get(1));
        System.out.println("-----------------------------");

        Set keys = hm.keySet();
        Iterator it1 = keys.iterator();

        while (it1.hasNext()) {
            Integer key = (Integer) it1.next();
            System.out.println(key);
        }
        System.out.println("-----------------------------");

        Collection value = hm.values();
        Iterator it2 = value.iterator();

        while (it2.hasNext()) {
            String values = (String) it2.next();
            System.out.println(values);
        }

        System.out.println("-----------------------------");

        Set entry = hm.entrySet();
        Iterator it3 = entry.iterator();

        while (it3.hasNext()) {
            System.out.println(it3.next());
        }
    }
}
