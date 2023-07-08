package Collections.Deque;

import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {
        ArrayDeque  aq = new ArrayDeque();
        aq.add("aq");
        aq.addFirst("90");
        aq.addLast(89);


        aq.offer(9);
        aq.offerFirst(0);
        aq.offerLast(64);
        System.out.println(aq);
    }
}
