package lr5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        Random r = new Random();

        for(int i = 0; i < size; i++) {
            arr[i] = r.nextInt(10);
        }

        System.out.println("Массив arr: ");
        System.out.println(Arrays.toString(arr));

        int[] arrResult = filterEvenNumbers(arr);

        System.out.println("Массив arrResult: ");
        System.out.println(Arrays.toString(arrResult));
    }

    public static int[] filterEvenNumbers(int[] arr) {
        return Arrays.stream(arr).filter(num -> num % 2 == 0).toArray();
    }
}
