package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "pineapple", "orange", "grape");
        String substring = "ap";
        List<String> filtered = filterBySubstring(strings, substring);

        System.out.println("Исходный список: " + strings);
        System.out.println("Строки содержащие '" + substring + "': " + filtered);
    }

    public static List<String> filterBySubstring(List<String> strings, String substring) {
        return strings.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}
