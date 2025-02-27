package lr1;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day of the week: ");
        String dayOfWeek = sc.nextLine();

        System.out.print("Enter name of the month: ");
        String nameOfMonth = sc.nextLine();

        System.out.print("Enter day number in the month: ");
        int dayNumber = sc.nextInt();

        System.out.print("Today " + dayOfWeek + " " + dayNumber + " " + nameOfMonth);
    }
}
