package Collections.Iterators;

import java.util.ArrayList;
import java.util.Iterator;

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

        

        System.out.println("--In for loop--");

        for(Object i:ar){
            System.out.println(i);
            //ar.add(100); //java.util.ConcurrentModificationException
        }

        System.out.println("--Interator--");
        Iterator it = ar.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
