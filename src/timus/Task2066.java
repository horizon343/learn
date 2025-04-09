package timus;

import java.util.Scanner;

public class Task2066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[][] permutations = {
                {a, b, c}, {a, c, b},
                {b, a, c}, {b, c, a},
                {c, a, b}, {c, b, a}
        };

        char[] operators = {'+', '-', '*'};

        int minResult = Integer.MAX_VALUE;

        for (int[] nums : permutations) {
            int x = nums[0];
            int y = nums[1];
            int z = nums[2];

            for (char op1 : operators) {
                for (char op2 : operators) {
                    int result = evaluate(x, op1, y, op2, z);

                    if (result < minResult)
                        minResult = result;
                }
            }
        }

        System.out.println(minResult);
    }

    private static int evaluate(int x, char op1, int y, char op2, int z) {
        int firstStep;
        if (op1 == '*')
            firstStep = x * y;
        else if (op1 == '+')
            firstStep = x + y;
        else
            firstStep = x - y;

        int secondStep;
        if (op2 == '*') {
            secondStep = y * z;
            if (op1 == '*')
                return x * y * z;
            else {
                if (op1 == '+')
                    return x + (y * z);
                else
                    return x - (y * z);
            }
        } else if (op2 == '+')
            secondStep = firstStep + z;
        else
            secondStep = firstStep - z;

        return secondStep;
    }
}
