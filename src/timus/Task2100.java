package timus;

import java.util.Scanner;

public class Task2100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int totalGuests = 2;

        for (int i = 0; i < n; i++) {
            String response = sc.nextLine().trim();
            totalGuests += 1;
            if (response.endsWith("+one"))
                totalGuests += 1;
        }

        if (totalGuests == 13)
            totalGuests += 1;

        int totalCost = totalGuests * 100;
        System.out.println("Количество мест: " + totalCost);
    }
}
