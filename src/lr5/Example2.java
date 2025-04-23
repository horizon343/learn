package lr5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        Random r = new Random();

        for(int i = 0; i < size; i++) {
            arr1[i] = r.nextInt(200);
            arr2[i] = r.nextInt(200);
        }

        System.out.println("Массив arr1: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Массив arr2: ");
        System.out.println(Arrays.toString(arr2));

        int[] arrResult = findCommonElements(arr1, arr2);

        System.out.println("Массив arrResult: ");
        System.out.println(Arrays.toString(arrResult));
    }

    public static int[] findCommonElements(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1)
                .filter(el1 -> Arrays.stream(arr2)
                        .anyMatch(el2 -> el2 == el1))
                .toArray();
    }
}
