package timus;

import java.util.Scanner;

public class Task1197 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String position = sc.nextLine().trim();
            int count = calculateAttackCells(position);
            System.out.println("Количество клеток: " + count);
        }
    }

    public static int calculateAttackCells(String position) {
        int x = position.charAt(0) - 'a' + 1;
        int y = position.charAt(1) - '0';

        int[][] moves = {
                {2, 1}, {2, -1}, {-2, 1}, {-2, -1},
                {1, 2}, {1, -2}, {-1, 2}, {-1, -2}
        };

        int count = 0;

        for (int[] move : moves) {
            int newX = x + move[0];
            int newY = y + move[1];

            if (newX >= 1 && newX <= 8 && newY >= 1 && newY <= 8)
                count++;
        }

        return count;
    }
}
