package lr3.Example11;

public class LinkedListHead {
    private Node head;

    public void add(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
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
