package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example12 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 3, 8, 21, 7, 15);
        int threshold = 10;
        List<Integer> filteredNumbers = filterGreaterThan(numbers, threshold);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Числа больше " + threshold + ": " + filteredNumbers);
    }

    public static List<Integer> filterGreaterThan(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(n -> n > threshold)
                .collect(Collectors.toList());
    }
}
