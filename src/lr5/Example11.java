package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example11 {
    public static void main(String[] args) {
        List<String> strings = List.of("Java", "Python", "C++", "JavaScript", "Go");
        int minLength = 4;
        List<String> filteredStrings = filterByLength(strings, minLength);

        System.out.println("Исходный список: " + strings);
        System.out.println("Строки длиннее " + minLength + " символов: " + filteredStrings);
    }

    public static List<String> filterByLength(List<String> strings, int minLength) {
        return strings.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }
}
