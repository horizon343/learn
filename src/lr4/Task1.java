package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int size = sc.nextInt();

            int[] array = new int[size];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                array[i] = sc.nextInt();
            }

            int sum = 0;
            int count = 0;
            for (int num : array) {
                if (num > 0) {
                    sum += num;
                    count++;
                }
            }

            if (count == 0) {
                throw new IllegalArgumentException("Ошибка: положительные элементы отсутствуют.");
            }

            double average = (double) sum / count;
            System.out.println("Среднее значение положительных элементов: " + average);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введена строка вместо числа или несоответствие числового типа.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
        }
    }
}
