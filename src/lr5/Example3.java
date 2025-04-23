package lr5;

import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        String string = "Lorem Ipsum is simply dummy text of The printing and typesetting industry. Lorem Ipsum Has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("Строка после сплитования ");
        for(String s : strings) {
            System.out.println(s);
        }

        List<String> stringsAfter = filterCapitalizeStrings(strings);

        System.out.println("Строка после преобразования ");
        for(String s : stringsAfter) {
            System.out.println(s);
        }
    }

    public static List<String> filterCapitalizeStrings(List<String> list) {
        return list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}
