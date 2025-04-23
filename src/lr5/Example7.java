package lr5;

import java.util.ArrayList;
import java.util.List;

public class Example7 {
    public static void main(String[] args) {
        List<String> words = List.of("Яблоко", "груша", "Арбуз", "вишня", "Дыня");
        List<String> filteredWords = filterCapitalized(words);

        System.out.println("Исходный список: " + words);
        System.out.println("Слова с заглавной буквы: " + filteredWords);
    }

    public static List<String> filterCapitalized(List<String> strings) {
        List<String> result = new ArrayList<>();

        for (String str : strings) {
            if (!str.isEmpty() && Character.isUpperCase(str.charAt(0))) {
                result.add(str);
            }
        }

        return result;
    }
}
