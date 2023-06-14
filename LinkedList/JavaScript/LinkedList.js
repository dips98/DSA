class Node {
    constructor(element) {
        this.element = element;
        this.next = null;
    }
}

class LinkedList {
    constructor() {
        this.head = null;
        this.size = 0;
    }
}

function add(element) {
    var node = new Node(element);
    var current;
    if (this.head == null) {
        this.head = node;
    } else {
        current = node;
        while (current.next) {
            current = current.next;
        }
        current.next = node;
    }
    this.size++;
}