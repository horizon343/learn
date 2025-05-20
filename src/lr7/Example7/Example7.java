package lr7.Example7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Example7 {
    public static void main(String[] args) {
        Person person = new Person("Maksim Shmygol", 22);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/lr7/Example7/person.json");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(person);
            outputStream.close();
            fileOutputStream.close();
            System.out.println("Успешная сериализация в файл person.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}