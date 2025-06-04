package lr8;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class Example10 {
    private JSONObject jsonObject;
    private JSONArray birthdays;
    private final String jsonFilePath = "src/lr8/birthdays.json";

    public Example10() {
        JSONParser parser = new JSONParser();
        try {
            FileReader reader = new FileReader(jsonFilePath);
            jsonObject = (JSONObject) parser.parse(reader);
            birthdays = (JSONArray) jsonObject.get("birthdays");
            reader.close();
        } catch (Exception e) {
            jsonObject = new JSONObject();
            birthdays = new JSONArray();
            jsonObject.put("birthdays", birthdays);
            saveJSON();
        }
    }

    private void saveJSON() {
        try (FileWriter file = new FileWriter(jsonFilePath)) {
            file.write(jsonObject.toJSONString());
            file.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addBirthday(String name, String date, String year) {
        JSONObject newBirthday = new JSONObject();
        newBirthday.put("name", name);
        newBirthday.put("date", date);
        newBirthday.put("year", year);
        birthdays.add(newBirthday);
        saveJSON();
        System.out.println("Birthday added successfully!");
    }

    public void searchBirthdays(String searchName) {
        birthdays.stream()
                .filter(birthday -> birthday instanceof JSONObject)
                .map(birthday -> (JSONObject) birthday)
                .filter(birthday -> searchName.equalsIgnoreCase((String) ((JSONObject) birthday).get("name")))
                .forEach(birthday -> {
                    System.out.println("\nFound birthday:");
                    System.out.println("Name: " + ((JSONObject) birthday).get("name"));
                    System.out.println("Date: " + ((JSONObject) birthday).get("date"));
                    System.out.println("Year: " + ((JSONObject) birthday).get("year"));
                });
    }

    public boolean deleteBirthday(String name) {
        Iterator iterator = birthdays.iterator();
        while (iterator.hasNext()) {
            JSONObject birthday = (JSONObject) iterator.next();
            if (name.equalsIgnoreCase((String) birthday.get("name"))) {
                iterator.remove();
                saveJSON();
                return true;
            }
        }
        return false;
    }

    public void displayAllBirthdays() {
        birthdays.stream()
                .filter(birthday -> birthday instanceof JSONObject)
                .map(birthday -> (JSONObject) birthday)
                .forEach(birthday -> {
                    System.out.println("\nBirthday:");
                    System.out.println("Name: " + ((JSONObject) birthday).get("name"));
                    System.out.println("Date: " + ((JSONObject) birthday).get("date"));
                    System.out.println("Year: " + ((JSONObject) birthday).get("year"));
                });
    }


    public static void main(String[] args) {
        Example10 parser = new Example10();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add new birthday");
            System.out.println("2. Search birthdays by name");
            System.out.println("3. Delete birthday");
            System.out.println("4. Display all birthdays");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter date (e.g., 15-05): ");
                    String date = scanner.nextLine();
                    System.out.print("Enter year: ");
                    String year = scanner.nextLine();
                    parser.addBirthday(name, date, year);
                    break;

                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    parser.searchBirthdays(searchName);
                    break;

                case 3:
                    System.out.print("Enter name to delete: ");
                    String nameToDelete = scanner.nextLine();
                    if (parser.deleteBirthday(nameToDelete)) {
                        System.out.println("Birthday deleted successfully!");
                    } else {
                        System.out.println("Birthday not found.");
                    }
                    break;

                case 4:
                    parser.displayAllBirthdays();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
