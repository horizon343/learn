package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35);
        int divisor = 2;
        List<Integer> divisibleNumbers = filterDivisible(numbers, divisor);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Числа, делящиеся на " + divisor + ": " + divisibleNumbers);
    }

    public static List<Integer> filterDivisible(List<Integer> numbers, int divisor) {
        return numbers.stream()
                .filter(n -> n % divisor == 0)
                .collect(Collectors.toList());
    }
}
