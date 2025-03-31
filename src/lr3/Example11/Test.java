package lr3.Example11;

public class Test {
    public static void main(String[] args) {
        System.out.println("Добавление с головы:");
        LinkedListHead listHead = new LinkedListHead();
        listHead.add(3);
        listHead.add(2);
        listHead.add(1);
        listHead.printList();

        System.out.println("\nДобавление с хвоста:");
        LinkedListTail listTail = new LinkedListTail();
        listTail.add(3);
        listTail.add(2);
        listTail.add(1);
        listTail.printList();
    }
}
