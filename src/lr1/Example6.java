package lr1;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter surname: ");
        String surname = sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter patronymic: ");
        String patronymic = sc.nextLine();

        System.out.println("Hello " + surname + " " + name + " " + patronymic);
    }
}
