package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        task3();
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int size = sc.nextInt();

            byte[] array = new byte[size];
            System.out.println("Введите элементы массива (тип byte):");
            for (int i = 0; i < size; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                array[i] = sc.nextByte();
            }

            byte sum = 0;
            for (byte num : array) {
                if ((num > 0 && sum > Byte.MAX_VALUE - num) ||
                        (num < 0 && sum < Byte.MIN_VALUE - num)) {
                    throw new ArithmeticException("Ошибка: переполнение при вычислении суммы.");
                }
                sum += num;
            }

            System.out.println("Сумма элементов: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введена строка вместо числа или несоответствие числового типа.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
        }
    }
}
