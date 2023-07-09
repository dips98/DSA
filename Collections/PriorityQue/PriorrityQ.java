package Collections.PriorityQue;

import java.util.PriorityQueue;

public class PriorrityQ {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        // pq.add("pq");  string not taking 
        // Its use binary search tree
        pq.add(1);
        pq.add(78);
        pq.add(99);
        pq.add(123);
        pq.add(123);
        pq.add(90);
        System.out.println(pq);
    }
}
