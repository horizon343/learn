package lr3.Example11;

public class LinkedListTail {
    private Node head;
    private Node tail;

    public void add(int value) {
        Node newNode = new Node(value);

        if (head == null)
        {
            tail = newNode;
            head = tail;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}
