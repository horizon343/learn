package timus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] K = new int[N];
        for (int i = 0; i < N; i++) {
            K[i] = sc.nextInt();
        }

        List<Character> result = new ArrayList<>();
        int maxK = Arrays.stream(K).max().getAsInt();
        StringBuilder sequence = new StringBuilder();
        long power = 1;

        while (sequence.length() < maxK) {
            sequence.append(power);
            power *= 10;
        }

        for (int i = 0; i < N; i++) {
            result.add(sequence.charAt(K[i] - 1));
        }

        for (char c : result) {
            System.out.print(c + " ");
        }
    }
}
