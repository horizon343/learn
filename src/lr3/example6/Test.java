package lr3.example6;

public class Test {
    public static void main(String[] args) {
        Node head = null;

        for(int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }

        Node ref = head;
        while(ref != null) {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}
