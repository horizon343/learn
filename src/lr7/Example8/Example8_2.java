package lr7.Example8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Example8_2 {
    public static void main(String[] args) {
        String inputFileName = "src/lr7/input.txt";
        String outputFileName = "src/lr7/output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName, StandardCharsets.UTF_8));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName, StandardCharsets.UTF_8))) {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи в файл: " + e.getMessage());
        }
    }
}