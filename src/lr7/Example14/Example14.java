package lr7.Example14;

import java.io.*;

public class Example14 {
    public static void main(String[] args) {
        Person person = new Person("Maksim Shmygol", 22, "IT-Engineer");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/lr7/Example14/person.ser"))) {
            outputStream.writeObject(person);
            System.out.println("Объект успешно сериализован");
        } catch (IOException e) {
            System.out.println("Ошибка при сериализации: " + e.getMessage());
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/lr7/Example14/person.ser"))) {
            Person restoredPerson = (Person) inputStream.readObject();
            System.out.println("Восстановленный объект: ");
            System.out.println("Имя: " + restoredPerson.getName());
            System.out.println("Возраст: " + restoredPerson.getAge());
            System.out.println("Профессия: " + restoredPerson.getProfession());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при десериализации: " + e.getMessage());
        }
    }
}
