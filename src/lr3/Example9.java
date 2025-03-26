package lr3;

import java.util.HashMap;

public class Example9 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Alice");
        map.put(1, "Tom");
        map.put(2, "Jerry");
        map.put(3, "John");
        map.put(4, "Marmok");
        map.put(5, "Kik");
        map.put(6, "Jon");
        map.put(7, "Maksim");
        map.put(8, "Andry");
        map.put(9, "Alexander");

        // Строки, у которых ключи больше 5
        System.out.println("Строки с ключом > 5: ");
        for (var entry : map.entrySet()) {
            if (entry.getKey() > 5)
                System.out.println(entry.getValue());
        }

        // Строка, у которой ключ равен 0
        if (map.containsKey(0)) {
            System.out.print("\nСтрока с ключом 0: ");
            System.out.println(map.get(0) + "\n");
        }

        // Перемноженные ключи, у которых длина строк больше 5
        long mult = 1;
        boolean hasMatch = false;

        for (var entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                mult *= entry.getKey();
                hasMatch = true;
            }
        }

        if (hasMatch)
            System.out.println("Произведение ключей равно: " + mult);
        else
            System.out.println("Нет строк с длиной больше 5");
    }
}
