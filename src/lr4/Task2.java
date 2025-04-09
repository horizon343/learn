package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        task2();
    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        try {
            System.out.println("Матрица:");
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

            System.out.print("Введите номер столбца для вывода: ");
            int column = sc.nextInt();

            if (column < 0 || column >= matrix[0].length) {
                throw new ArrayIndexOutOfBoundsException("Ошибка: нет столбца с таким номером.");
            }

            System.out.println("Столбец " + column + ":");
            for (int[] row : matrix) {
                System.out.println(row[column]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введена строка вместо числа.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
        }
    }
}
