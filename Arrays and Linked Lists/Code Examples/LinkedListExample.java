// These may only work in seperate files :)

public class Node {
    Node next; // pointer to the next node in the list
    int data; // can be anything

    public Node(int data){
        this.data = data;
    }
}

public class LinkedList {
    Node head;

    public void append(int data){
        if (head == null){
            head = new Node(data);
            return;
        }
        Node current = head; 
        while(current.next != null){ // while the current node is pointing to another node,
            current = current.next;  // current node is assigned to the next node
        }
        current.next = new Node(data); // Once we find the end, add a new node
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
        }

        Node current = head;
        while(current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }

            current = current.next;
        }
    }
}