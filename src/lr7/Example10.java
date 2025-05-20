package lr7;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Example10 {
    public static void main(String[] args) {
        String inputFile = "src/lr7/input.txt";
        String outputFile = "src/lr7/output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile, StandardCharsets.UTF_8));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Файл успешно скопирован");
        } catch (IOException e) {
            System.out.println("Ошибка при копировании файла: " + e.getMessage());
        }
    }
}
