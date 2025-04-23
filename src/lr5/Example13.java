package lr5;

import java.util.List;
import java.util.stream.Collectors;

public class Example13 {
    public static void main(String[] args) {
        List<String> strings = List.of("Hello", "Java8", "World!", "Programming", "2023", "Code");
        List<String> filteredStrings = filterLettersOnly(strings);

        System.out.println("Исходный список: " + strings);
        System.out.println("Строки только с буквами: " + filteredStrings);
    }

    public static List<String> filterLettersOnly(List<String> strings) {
        return strings.stream()
                .filter(s -> s != null && s.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());
    }
}
