package lr5;

import java.util.Arrays;

public class Example5 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenNumbers = filterEvenNumbers(inputArray);

        System.out.println("Исходный массив: " + Arrays.toString(inputArray));
        System.out.println("Четные числа: " + Arrays.toString(evenNumbers));
    }

    public static int[] filterEvenNumbers(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0)
                count++;
        }

        int[] result = new int[count];

        int index = 0;
        for (int number : numbers) {
            if (number % 2 == 0)
                result[index++] = number;
        }

        return result;
    }
}
