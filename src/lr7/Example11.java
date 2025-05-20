package lr7;

import java.io.File;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите название файла: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);
        if (file.exists() && file.isFile()) {
            System.out.println("Размер файла " + fileName + ": " + file.length() + " байт");
        } else {
            System.out.println("Файл не найден или не является файлом");
        }
    }
}
