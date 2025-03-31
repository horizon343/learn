package timus;

import java.util.Scanner;

public class Task2001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt(), b1 = sc.nextInt();
        int a2 = sc.nextInt(), b2 = sc.nextInt();
        int a3 = sc.nextInt(), b3 = sc.nextInt();

        int x = a1 - a3;
        int y = b1 - b2;

        System.out.println(x + " " + y);
    }
}
