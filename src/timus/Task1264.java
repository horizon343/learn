package timus;

import java.util.Scanner;

public class Task1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите длинну массива: ");
        int N = sc.nextInt();

        System.out.print("\nВведите максимальное значение элемента массива: ");
        int M = sc.nextInt();

        int seconds = N * (M + 1);

        System.out.println("Потраченное число секунд: " + seconds);
    }
}
