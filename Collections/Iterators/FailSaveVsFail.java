package Collections.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSaveVsFail {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList<>();
        ar.add(1);
        ar.add(15);
        ar.add(65);
        ar.add(86);
        ar.add(90);
        ar.add(65);
        ar.add(85);
        ar.add(99);

        System.out.println("--In simple for loop--");

        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
            //ar.add(100); //Will gwt in ifinite loop
        }

        System.out.println("--In for loop--");

        for(Object i:ar){
            System.out.println(i);
            //ar.add(100); //java.util.ConcurrentModificationException -- called fail fast
        }

        System.out.println("--Interator--");

        Iterator it = ar.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            //ar.add(100); //java.util.ConcurrentModificationException --Called Fail fast
        }

        // fail safe
        System.out.println("--Fail safe using iterator--");
        CopyOnWriteArrayList ca = new CopyOnWriteArrayList();
        ca.add(1);
        ca.add(15);
        ca.add(65);
        ca.add(86);
        ca.add(90);
        ca.add(65);
        ca.add(85);
        ca.add(99);

        Iterator itc = ca.iterator();

        while(itc.hasNext()){
            System.out.println(itc.next());
            ca.add(98);
        }

    }
}
