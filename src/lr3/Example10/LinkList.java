package lr3.Example10;

import java.util.LinkedList;

public class LinkList {

    public static int solve(int n) {
        LinkedList<Integer> people = new LinkedList<>();
        for (int i = 1; i <= n; i++)
            people.add(i);

        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size();
            people.remove(index);
        }

        return people.get(0);
    }

    public static void main(String[] args) {
        int n = 100000;

        long start = System.currentTimeMillis();
        int res = solve(n);
        long end = System.currentTimeMillis();

        System.out.println("LinkedList: Остался человек: " + res + "; время выполнения: " + (end - start) + " мс");
    }
}
