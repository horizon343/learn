package timus;

import java.util.Scanner;

public class Task2012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Количество задач, решенных за час: ");
        int f = sc.nextInt();

        int totalTime = 5 * 60;
        int timeSpent = 60;

        int tasks = 12 - f;
        timeSpent += tasks * 45;

        System.out.println(timeSpent <= totalTime ? "YES" : "NO");
    }
}
