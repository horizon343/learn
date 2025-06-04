package timus;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N < 1 || N > 1000) {
            System.err.println("Ошибка: N должно быть в диапазоне от 1 до 1000");
            scanner.close();
            return;
        }

        int[] sequence = new int[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextInt();
            if (sequence[i] < 1 || sequence[i] > 10) {
                System.err.println("Ошибка: Числа должны быть от 1 до 10");
                scanner.close();
                return;
            }
        }
        scanner.close();

        ArrayList<Integer> result = new ArrayList<>();
        int count = 1;
        int current = sequence[0];

        for (int i = 1; i < N; i++) {
            if (sequence[i] == current) {
                count++;
            } else {
                result.add(count);
                result.add(current);
                current = sequence[i];
                count = 1;
            }
        }

        result.add(count);
        result.add(current);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
