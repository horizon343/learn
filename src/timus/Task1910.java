package timus;

import java.util.Scanner;

public class Task1910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int maxSum = 0;
        int midIndex = 1;
        for (int i = 1; i < n - 1; i++) {
            int sum = a[i - 1] + a[i] + a[i + 1];
            if (sum > maxSum) {
                maxSum = sum;
                midIndex = i;
            }
        }

        System.out.println(maxSum + " " + (midIndex + 1));
    }
}
