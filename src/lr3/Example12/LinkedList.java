package lr3.Example12;

public class LinkedList {
    private Node head;
    private Node tail;

    public void createHead(int[] values) {
        for (int value : values)
            addFirst(value);
    }

    public void createTail(int[] values) {
        for (int value : values) {
            addLast(value);
        }
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null)
            tail = head;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            tail = newNode;
            head = tail;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insert(int index, int value) {
        if (index == 0) {
            addFirst(value);
            return;
        }

        Node current = head;
        for (int i = 0; current != null && i < index - 1; i++)
            current = current.next;
        if (current == null) return;

        Node newNode = new Node(value);
        newNode.next = current.next;
        current.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void removeFirst() {
        if (head == null) return;

        head = head.next;
        if (head == null) tail = null;
    }

    public void removeLast() {
        if (head == null) return;

        if (head.next == null) {
            tail = null;
            head = tail;
            return;
        }

        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }

        current.next = null;
        tail = current;
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }

        Node current = head;
        for (int i = 0; current != null && i < index - 1; i++)
            current = current.next;

        if (current == null || current.next == null) return;

        current.next = current.next.next;
        if (current.next == null)
            tail = current;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;

        while (current != null) {
            result.append(current.value).append(" -> ");
            current = current.next;
        }
        result.append("null");
        return result.toString();
    }

    public void createHeadRec(int[] values, int index) {
        if (index < values.length) {
            addFirst(values[index]);
            createHeadRec(values, index + 1);
        }
    }

    public void createTailRec(int[] values, int index) {
        if (index < values.length) {
            addLast(values[index]);
            createTailRec(values, index + 1);
        }
    }

    private String toStringRec(Node node) {
        if (node == null) return "null";
        return node.value + " -> " + toStringRec(node.next);
    }

    public String toStringRec() {
        return toStringRec(head);
    }
}
