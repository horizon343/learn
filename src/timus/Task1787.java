package timus;

import java.util.Scanner;

public class Task1787 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        int queue = 0;

        for (int i = 0; i < n; i++) {
            int arrivingCars = sc.nextInt();
            queue += arrivingCars;
            queue = Math.max(0, queue - k);
        }

        System.out.println("Машин в пробке: " + queue);
    }
}
