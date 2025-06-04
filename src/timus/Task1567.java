package timus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1567 {
    public static void main(String[] args) {
        Map<Character, Integer> keypad = new HashMap<>();
        keypad.put('a', 1); keypad.put('b', 2); keypad.put('c', 3); // Key 1
        keypad.put('d', 1); keypad.put('e', 2); keypad.put('f', 3); // Key 2
        keypad.put('g', 1); keypad.put('h', 2); keypad.put('i', 3); // Key 3
        keypad.put('j', 1); keypad.put('k', 2); keypad.put('l', 3); // Key 4
        keypad.put('m', 1); keypad.put('n', 2); keypad.put('o', 3); // Key 5
        keypad.put('p', 1); keypad.put('q', 2); keypad.put('r', 3); // Key 6
        keypad.put('s', 1); keypad.put('t', 2); keypad.put('u', 3); // Key 7
        keypad.put('v', 1); keypad.put('w', 2); keypad.put('x', 3); // Key 8
        keypad.put('y', 1); keypad.put('z', 2); // Key 9
        keypad.put(' ', 1); // Key 0 (space)
        keypad.put(',', 1); keypad.put('.', 2); keypad.put('!', 3); // Key #

        Scanner scanner = new Scanner(System.in);
        String slogan = scanner.nextLine();
        scanner.close();

        long totalCost = 0;
        for (char c : slogan.toCharArray()) {
            if (!keypad.containsKey(c)) {
                System.err.println("Ошибка: Недопустимый символ '" + c + "' в строке.");
                return;
            }
            totalCost += keypad.get(c);
        }

        System.out.println(totalCost);
    }
}
