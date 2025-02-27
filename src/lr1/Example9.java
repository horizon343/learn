package lr1;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name of the month: ");
        String nameOfMonth = sc.nextLine();

        System.out.print("Enter number of days in a month: ");
        int numberDays= sc.nextInt();

        System.out.print(nameOfMonth + " содержит " + numberDays + " дней");
    }
}
