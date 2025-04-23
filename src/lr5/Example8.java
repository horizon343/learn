package lr5;

import java.util.ArrayList;
import java.util.List;

public class Example8 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> squares = getSquares(numbers);

        System.out.println("Исходные числа: " + numbers);
        System.out.println("Квадраты чисел: " + squares);
    }

    public static List<Integer> getSquares(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (Integer num : numbers)
            result.add(num * num);

        return result;
    }
}
