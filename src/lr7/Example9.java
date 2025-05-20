package lr7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example9 {
    public static void main(String[] args) {
        String fileName = "src/lr7/input.txt";
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("Количество строк в файле: " + lineCount);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
