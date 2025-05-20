package lr7.Example8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example8_1 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/lr7/input.txt"));
            int lineCount = 0;
            while (reader.readLine() != null) {
                lineCount++;
            }
            reader.close();
            System.out.println("Количество строк в файле: " + lineCount);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
