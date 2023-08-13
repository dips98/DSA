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
        System.out.println(hm.get(1));
        System.out.println("-----------------------------");
        Set keys = hm.keySet();
        Iterator it1 = keys.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}
