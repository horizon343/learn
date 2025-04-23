package lr5;

import java.util.List;
import java.util.stream.Collectors;

public class Example14 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(15, 8, 23, 12, 5, 19, 10);
        int threshold = 15;
        List<Integer> filteredNumbers = filterLessThan(numbers, threshold);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Числа меньше " + threshold + ": " + filteredNumbers);
    }

    public static List<Integer> filterLessThan(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(n -> n < threshold)
                .collect(Collectors.toList());
    }
}
