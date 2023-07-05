package Collections.ArrayList;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);
        System.out.println(al1);

        ArrayList al2 = new ArrayList();
        al2.add(12);
        al2.add("ji");
        System.out.println(al2);
        System.out.println("After adding collection");
        al2.addAll(al1);
        System.out.println(al2);

    }
}
