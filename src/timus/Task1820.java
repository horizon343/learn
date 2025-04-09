package timus;

import java.util.Scanner;

public class Task1820 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int time;
        if (n <= k)
            time = 2;
        else
            time = (2 * n + k - 1) / k;

        System.out.println(time);
    }
}
