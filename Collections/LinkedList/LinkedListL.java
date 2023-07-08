package Collections.LinkedList;

import java.util.LinkedList;

// Linked llist  implements List and Deque interface so its having more extra methods than array list
public class LinkedListL {
    public static void main(String[] args) {
        LinkedList Ll = new LinkedList();
        Ll.add(1);
        Ll.add("KO");
        Ll.add('s');
        Ll.addFirst("Pw");
        Ll.addLast("Opp");
        System.out.println(Ll);
        System.out.println(Ll.peek());
        System.out.println(Ll.peekLast());
        System.out.println(Ll.poll());
        System.out.println(Ll.pop());
        System.out.println(Ll);
    }
}
