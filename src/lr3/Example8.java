package lr3;

import java.util.Scanner;

public class Example8 {

    public static void inputArray(int[] array, int index, Scanner sc) {
        if (index >= array.length)
            return;

        System.out.print("Введите элемент [" + index + "]: ");
        array[index] = sc.nextInt();
        inputArray(array, index + 1, sc);
    }

    public static void outputArray(int[] array, int index) {
        if (index >= array.length)
            return;

        System.out.print(array[index]);

        if (index + 1 < array.length)
            System.out.print(", ");

        outputArray(array, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Ввод элементов массива: ");
        inputArray(array, 0, sc);

        System.out.println("Вывод массива: ");
        System.out.print("[ ");
        outputArray(array, 0);
        System.out.print(" ]");
    }
}
