package timus;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1880 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < n1; i++) set1.add(sc.nextInt());

        int n2 = sc.nextInt();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n2; i++) set2.add(sc.nextInt());

        int n3 = sc.nextInt();
        Set<Integer> set3 = new HashSet<>();
        for (int i = 0; i < n3; i++) set3.add(sc.nextInt());

        set1.retainAll(set2);
        set1.retainAll(set3);

        System.out.println(set1.size());
    }
}
