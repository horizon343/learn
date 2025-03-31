package lr3;

import java.util.*;

public class Example13 {
    private static final int ELEMENTS_COUNT = 4 * 1_000_00;
    private static final int INDEX_TEST_COUNT = 4 * 1_000_000_0;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> treeSet = new TreeSet<>();
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

        System.out.println("Сравнение времени выполнения операций:");

        System.out.println("\nДобавление в начало:");
        System.out.println("ArrayList: " + addToStartList(arrayList) + " ms");
        System.out.println("TreeSet: " + addToStartSet(treeSet) + " ms");
        System.out.println("LinkedHashMap: " + addToStartMap(linkedHashMap) + " ms");

        arrayList = new ArrayList<>();
        System.out.println("\nДобавление в конец:");
        System.out.println("ArrayList: " + addToEndList(arrayList) + " ms");

        arrayList = new ArrayList<>();
        System.out.println("\nДобавление в середину:");
        System.out.println("ArrayList: " + addToMiddleList(arrayList) + " ms");

        System.out.println("\nПоиск элемента по индексу:");
        System.out.println("ArrayList: " + getByIndexList(arrayList) + " ms");
        System.out.println("TreeSet: " + containsInSet(treeSet) + " ms");
        System.out.println("LinkedHashMap: " + containsInMap(linkedHashMap) + " ms");

        System.out.println("\nУдаление с начала:");
        System.out.println("ArrayList: " + removeFromStartList(arrayList) + " ms");
        System.out.println("TreeSet: " + removeFromSet(treeSet) + " ms");
        System.out.println("LinkedHashMap: " + removeFromMap(linkedHashMap) + " ms");

        addToStartList(arrayList);
        System.out.println("\nУдаление с конца:");
        System.out.println("ArrayList: " + removeFromEndList(arrayList) + " ms");

        addToStartList(arrayList);
        System.out.println("\nУдаление из середины:");
        System.out.println("ArrayList: " + removeFromMiddleList(arrayList) + " ms");
    }

    private static long addToStartList(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < ELEMENTS_COUNT; i++)
            list.add(0, i);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long addToEndList(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < ELEMENTS_COUNT; i++)
            list.add(i);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long addToMiddleList(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < ELEMENTS_COUNT; i++)
            list.add(list.size() / 2, i);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long removeFromStartList(List<Integer> list) {
        long start = System.currentTimeMillis();

        while (!list.isEmpty())
            list.remove(0);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long removeFromEndList(List<Integer> list) {
        long start = System.currentTimeMillis();

        while (!list.isEmpty())
            list.remove(list.size() - 1);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long removeFromMiddleList(List<Integer> list) {
        long start = System.currentTimeMillis();

        while (!list.isEmpty())
            list.remove(list.size() / 2);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getByIndexList(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < INDEX_TEST_COUNT; i++)
            list.get(i % list.size());

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long addToStartSet(Set<Integer> set) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < ELEMENTS_COUNT; i++)
            set.add(i);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long addToStartMap(Map<Integer, Integer> map) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < ELEMENTS_COUNT; i++)
            map.put(i, i);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long containsInSet(Set<Integer> set) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < ELEMENTS_COUNT; i++)
            set.contains(i);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long containsInMap(Map<Integer, Integer> map) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < ELEMENTS_COUNT; i++)
            map.containsKey(i);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long removeFromSet(Set<Integer> set) {
        long start = System.currentTimeMillis();

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long removeFromMap(Map<Integer, Integer> map) {
        long start = System.currentTimeMillis();

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        long end = System.currentTimeMillis();

        return end - start;
    }
}
