package lr3.Example12;

public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.createHead(new int[]{3, 2, 1});
        System.out.println("Ввод с головы: " + list.toString());

        list.createTail(new int[]{4, 5, 6});
        System.out.println("Ввод с хвоста: " + list.toString());

        list.addFirst(0);
        System.out.println("Добавлен 0 в начало: " + list.toString());

        list.addLast(1);
        System.out.println("Добавлен 1 в конец: " + list.toString());

        list.insert(3, 999);
        System.out.println("Вставлен элеметн 999 по индексу 3: " + list.toString());

        list.removeFirst();
        System.out.println("Удалён первый элемент: " + list.toString());

        list.removeLast();
        System.out.println("Удалён последний элемент: " + list.toString());

        list.remove(2);
        System.out.println("Удалён элемент по индексу 2: " + list.toString());
    }
}
